package ReplaceStringIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ReplaceString {
	
	
		public static String replace() throws IOException{
	    	 
	             File file = new File("sample.txt");
	             BufferedReader reader = new BufferedReader(new FileReader(file));
	             String line = "", oldtext = "";
	             while((line = reader.readLine()) != null)
	                 {
	                 oldtext += line + "\r\n";
	             }
	             reader.close();
	             // replace a word in a file
	             String newtext = oldtext.replaceAll("Sabitha", "Sri");
	            
	          
	            
	            FileWriter writer = new FileWriter("sample.txt");
	            writer.write(newtext);
	            //System.out.println(newtext);
	            writer.close();
	        
	    	 
			return newtext;
	     }
	    	  
	     
	
	    
	     public static void main(String args[]) throws IOException
	         {
	    	 
	    	 String result = replace();
	    	
			System.out.println("new String is:" +result);
	    	 
	       
	     }
	}


	

