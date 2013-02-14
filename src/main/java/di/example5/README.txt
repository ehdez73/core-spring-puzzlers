Injecting Spring Beans into objects that has been created with the "new" keyword

This is possible because we use:

  - AspectJ (maven plugin)
  
  - @Configurable  
   
  - <context:annotation-config/>
    <context:spring-configured />
    
    
    http://static.springsource.org/spring/docs/3.1.x/spring-framework-reference/html/aop.html#aop-using-aspectj