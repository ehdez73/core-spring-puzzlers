package samples.di.example4;

public class BeanB {

	public BeanB(){
		System.out.println("BeanB created");
	}
	
	private BeanA beanA;

	public void setBeanA(BeanA beanA) {
		System.out.println("setting beanA");
		this.beanA = beanA;
	}

	public BeanA getBeanA() {
		return beanA;
	}
	
}
