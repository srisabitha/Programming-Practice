package EqualsFunction;

public class EqualsFunction {
	
	public static boolean check(String str1,String str2){
		
		
		if(str1.equals(str2)){
		System.out.println("both string are same");
			
		return true;
		}
		else {
			System.out.println("both string are not same");
			return false;
		}
	}
	
	public static long hashcode(String str1){
		return str1.hashCode();
	}
	
	public static void main(String args[]){
		String str1 = new String("Welcome to java");
		String str2 = "Welcome to java";
				
		boolean result = check(str1,str2);
		System.out.println("result:" +result);
		long code = hashcode(str1);
		System.out.println(code);
		
		
	}

}
