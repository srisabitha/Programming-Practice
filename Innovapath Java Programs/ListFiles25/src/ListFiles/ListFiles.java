package ListFiles;

import java.io.File;

public class ListFiles {
	
	    public static File[] list(){
	    	
	    	 File file = new File("/Users/sabitha/documents/workspace/example1");
		        File[] files = file.listFiles();
		        for(File f: files){
		            System.out.println(f.getName());
		            
		        }
		        return files;
		    }
	  

	    public static void main(String a[]){
	        /*File file = new File("/Users/sabitha/documents/workspace");
	        File[] files = file.listFiles();
	        for(File f: files){
	            System.out.println(f.getName());*/
	    	
	    	list();
	    	
	    	
	        }
	    }
	
	
	
	

