package di.example4;

public class BeanA {

	public BeanA(){
		System.out.println("BeanA created");
	}
	private BeanB beanB;
	
	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
		System.out.println("setting BeanB");
		
	}

	public BeanB getBeanB() {
		return beanB;
	}
	
}
