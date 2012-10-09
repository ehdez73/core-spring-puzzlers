package samples.context.example1;

import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * Example of adding a bean to the AppContext in runtime
 * We need that the ClassPathXmlApplicationContext inherit from GernericApplicationContext and we will
 * add the new bean to the last
 *
 */
public class Bootstrap {

	public static void main(String... args) {
		
		// Parent context
		GenericApplicationContext parent = new GenericApplicationContext();
		parent.refresh();
		
		// Child context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"samples/context/example1/spring-config.xml"}, parent);
		
		System.out.println("Application started from main");
		
		// Retrieve the bean defined in XML
		AccountService accountService = context.getBean(AccountService.class);
		accountService.doSomething();
		
		// Add the new bean to parent
		RootBeanDefinition sampleServiceDef = new RootBeanDefinition(SampleService.class);
		sampleServiceDef.getPropertyValues().addPropertyValue("value", "MORE TEXT");
		parent.registerBeanDefinition("sampleService", sampleServiceDef);
		
		// Retrieve this new bean from child
		SampleService ss = (SampleService) context.getBean("sampleService");
		ss.doSomething();

	}
}
