This example is only for introduce AOP.

Starting with Calculator.java , we will code some new requirements:

To divde method: 

	* Log a message before the execution of the method logic
	* If an exception is thrown, catch it and mail it to your account (Inject and use the helper MailUtils )
	* Add security check ( inject and use the helper SecurityUtils ) 


After doing that, you have a new requirement:  do the same to ALL the methods of the class.
	
The code should be similar to Calculator2.java

Here, you can see what is CODE TANGLING : logic inside a method is mixed with security, logging  and exception control.
and CODE SCATTERING: the same code is repeated in several places.

Now make a question:

	What if the requirement is to add this new code to all the methods of all the classes of several packages ???
	
	And.... if we want to add to classes we don't own ? (libraries)
	
	 



   	 