package exceptionHandling;


public class Q5 {
	public static void main(String[] args) {
		try {
			ArithException.divide(7);
		}catch(CustomException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}
	public static  class CustomException extends Exception{
		public CustomException(String s,Throwable e ) {
			super(s,e);
		}
		
	}

	public static class ArithException extends Exception{
		public static void divide(int n) throws CustomException{
			try {
				int num=n/0;
			}catch(ArithmeticException e) {
				throw new CustomException("This is custom Exception",e);
			}
		}
		
	}

}






// Q5.Write a program that demonstrates chained exceptions. 
//Create a custom exception class CustomException and 
//another class that throws an ArithmeticException.
//Catch the ArithmeticException and throw a CustomException 
//with the ArithmeticException as a chained exception.





