package tx.example1;

import javax.sql.DataSource;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.AfterTransaction;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("spring-config.xml")
public class TestServiceA {
	
	@Autowired 
	private DataSource datasource;
	
	@Autowired
	private ServiceA serviceA;
	
	private JdbcTemplate jdbcTemplate;
	
	@Before
	public void before(){
		jdbcTemplate = new JdbcTemplate(datasource);
		assertEquals(0,jdbcTemplate.queryForInt("select count(*) from t_data"));
	}
	
	@Test
	@Transactional
	public void doTest(){
		serviceA.insertFOO();
		serviceA.insertBAR();
	}
	
	@After
	public void after(){
		assertEquals("After test but still inside test transaction", 2, jdbcTemplate.queryForInt("select count(*) from t_data"));
	}
	
	@AfterTransaction
	public void afterTx(){
		assertEquals("After rollback", 0, jdbcTemplate.queryForInt("select count(*) from t_data"));
	}
	

}
