package samples.aop.intro;


/**
 * Simple calculator
 */
public class Calculator {

	public int div( int op1, int op2){
		return op1 / op2;
	}
	
	public int sum( int op1, int op2){
		return op1 + op2;
	}
	
	public int sub( int op1, int op2){
		return op1 - op2;
	}
	
	public int mult(int op1, int op2){
		return op1 * op2;
	}
}
