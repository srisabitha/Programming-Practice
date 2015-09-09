package StringPrint;

public class StrPrint {
	
	public static String printstr(String str){
		str = str.trim();
		
		//char[] actualChars = str.toCharArray();
		char[] printChars = new char[str.length()+3];
		int num=0;
		char count=49;
		
		for(int i=0; i < str.length(); i++){
			
				if(str.charAt(i) == ' '){
					printChars[num] = count;
					num++; count++;
					printChars[num] = str.charAt(i);
					num++;
				}
				else if (i == str.length() - 1) 
				{
					printChars[num] = str.charAt(i);
					num++;
					printChars[num] = count;
					num++; count++;
				} else {
					printChars[num] = str.charAt(i);
					num++;		
				}
		}
		String rev = new String(printChars);
		return rev;
	}	
		
	
	
	public static void main(String args[])
	{
		String str = "This is nice";
		String s = printstr(str);
		System.out.println(s);
		
	}
	
	
	
	

}
