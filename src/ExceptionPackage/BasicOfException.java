package ExceptionPackage;
import java.util.Scanner;
public class BasicOfException {

	public static void main(String[] args) {
		System.out.println("ITM");
		System.out.println("Course");
		//System.out.println(10/0);//Exception arise in this line 
		/**
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero
		 */
		/**to avoid this Exception we can introduce try catch block*/
		try
		{
			System.out.println(10/0);
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		/** now when the exceotion came try block throws it and catch block cathes it
		 *and handels the exception and program terminates gracefully 
		 */
		System.out.println("Ravenshaw");
		
		
		//code -2
		
		System.out.println("program starts");
		try
		{
			int []a= {10,20,30};
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);//this line will show Exception array index out of bound
		}catch(ArrayIndexOutOfBoundsException aioobe)
		{
			System.out.println("we are getting an exception in the try block i.e., "+aioobe);
		}
		System.out.println("Rest of the code");
		
		//code-3
		
		/**if there is no Exception in the try block then catch block will not be executed.
		 * 
		 */
		try
		{
			System.out.println("hello out there...");
			System.out.println("Here is Kshirabdi...");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("there is exception the the try block");
			
		}
		System.out.println("after try catch block");
		
		//code-4
		
		/** independ try block is not allowed
		 * either catch or finally block should be present after try bolck
		 */
//		try {
//			//compilation error
//		}
		
		//code - 5
		
		/** 
		 * Between try catch block independent statements are not allowed
		 */
		
		try
		{
			System.out.println(10/0);
		}
		//int x;  //it will show ce
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		
		//code - 6
		/**
		 * once control goes out of try block can not be return back 
		 */
		try
		{
			System.out.println("hello");
			int a=10/0;
			int b=0;//....
			 b++;//......
			 System.out.println(b++);//...after exception arise these statements will not be executed
			
		}catch(Exception e) //root class of exception it can hold any type of exceptions
		{
			System.out.println(e);
			
		}
		
		//code - 7
		
		/**
		 * the way of handling the exception is varied from exception to exception so it is recommended to provide try with number
		 * of catcg blocks
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("provide the divission values = ");
		int n=sc.nextInt();
		try
		{
			System.out.println(10/n);
			String str=null;
			System.out.println(" u r name is : "+ str);
			System.out.println("ur name length is ---->"+str.length());//thus string is null length function will arise exception because it can not invoke String.length() 
		}catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(NullPointerException npe)
		{
			System.out.println(npe);
		}
		
		//Code - 8
		
		/**If exception arise in catch block it will always lead to abnormal termination
		 * 
		 */
		try {
			System.out.println(34/0);
			
		}catch(Exception e)
		{
			System.out.println(e);
			char b[]= {28};
			//System.out.println(b[2]);
		}
	}

}
