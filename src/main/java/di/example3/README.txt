Remember : Prototype creates a new instance each time the bean is retrieved from Application Context. 
Here the Bean is created when D.I. occurs. 
If you want a new instance of ServiceA, use a scoped proxy

<bean id="serviceA" class="samples.di.example3.ServiceAImpl" scope="prototype">
	<aop:scoped-proxy/>
</bean> 