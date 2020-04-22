package loanPackage;

public class firstTestcases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   System.out.println("hello world !");
	   add(2,4,"shubham");  
	   add(10,10);
	   
	   SecondTestClass sd = new SecondTestClass();//object 
	   int result = sd.multi(10, 20);
	   System.out.println(" value :    "+ result);
	  
     
	}
	  public static void add(int a, int b, String i) {
			
			int c;
			c=a+b;
		    System.out.println(" Add of two numbers of  :"+c + i);
			
		}
	public static void add(int a, int b) {
		
		int c;
		c=a+b;
	    System.out.println(" Add of three numbers :"+c);
		
	}
   public static void add(int a, int b, int i) {
		
		int c;
		c=a+b;
	    System.out.println(" Add of two numbers :"+c);
		
	}
	

}
