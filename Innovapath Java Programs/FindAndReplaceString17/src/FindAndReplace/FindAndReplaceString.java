package FindAndReplace;

public class FindAndReplaceString {
	
	public static String replace(String string,
			String oldSubstring,
			String newSubstring) {
		String result = string;

		if ((string != null) && (string.length() > 0)
				&& (oldSubstring != null) && (oldSubstring.length() > 0)
				&& (newSubstring != null))
		{
			int pos = string.indexOf(oldSubstring);
			result = string.substring(0, pos)
					+ newSubstring
					+ string.substring(pos + oldSubstring.length());
		}

		return result;
	}

      public static void main(String args[]){
    	  
    	  String str = "This is an actual string";
    	  String oldSubStr = "actual";
    	  String newSubstr = "final";
    	  
    	  String s = replace(str, oldSubStr,newSubstr);
    	  
    	  System.out.println("the new string is" +s);
    	  
    	  
      }

}
