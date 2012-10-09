
It's a common pitfall : 

When using proxies, if method a() calls method b() on the same class/interface, advice will never be executed for method b()


Be carefull this also applies to inner calls to @Transactional methods in the same class i.e:
 
	@Transactional(propagation=REQUIRED)
	public void method1(){
		//... 
		method2();
	} 
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void method2(){
		//... 
	}
	
	
	It will not create a new transaction if the call is from method1()  !!!
