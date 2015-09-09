package Exception;

public class Exceptions {

	public static void main(String args[]){  
		   try{  
			   String s=null;  
			   System.out.println(s.length());  
		   }  
		   catch(NullPointerException  e)
		       {System.out.println("task1 is not completed");}  
		   
		   finally{System.out.println("finally block is always executed");}  
		  
		   System.out.println("rest of the code...");  
		 }  
}
