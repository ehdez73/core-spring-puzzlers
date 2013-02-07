Introductions (known as inter-type declarations in AspectJ) enable an aspect to declare that advised objects implement a given interface, and to provide an implementation of that interface on behalf of those objects.
http://static.springsource.org/spring/docs/3.2.x/spring-framework-reference/html/aop.html#aop-introductions

We add to Service an aspect which add a new interface for counting the number of times it's been used.