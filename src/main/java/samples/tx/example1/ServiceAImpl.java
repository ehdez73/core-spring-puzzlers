package samples.tx.example1;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class ServiceAImpl implements ServiceA {
	
	private JdbcTemplate jdbcTemplate;
	
	public ServiceAImpl(DataSource datasource){
		jdbcTemplate = new JdbcTemplate(datasource);
	}

	@Transactional
	public void insertFOO() {
		jdbcTemplate.update("INSERT INTO T_DATA VALUES ('FOO')");
	}

	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void insertBAR() {
		jdbcTemplate.update("INSERT INTO T_DATA VALUES ('BAR')");
	}

}
