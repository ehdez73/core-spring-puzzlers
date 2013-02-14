package di.example5;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable(autowire=Autowire.BY_NAME)
public class BeanA {
	
	@Autowired
	private BeanB beanB;

	public BeanB getBeanB() {
		return beanB;
	}
	
}
