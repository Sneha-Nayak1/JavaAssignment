package exceptionHandling;

public class ExceptionPropogation {
public static void methodC() {
		int num=100/0;
	}
public static void methodB() {
		methodC();
	}
	public static void methodA() {
		try {
			methodB();
		}catch(Exception e) {
			System.out.println("Exception Handled");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionPropogation p=new ExceptionPropogation();
		p.methodA();

	}

}


//Write a program with three methods - methodA, methodB, and methodC.
//methodA calls methodB, and methodB calls methodC. 
//Throw a custom exception in methodC and catch it in methodA.
//Demonstrate exception propagation.