import java.io.*;
	import java.util.*;
	
public class ExploringDataTypes {

	/* 
	 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
	 * Your class should be named CandidateCode.
	*/

	
	    public static void main(String args[] ) throws Exception {
	        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
	        /*PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));*/
	        
	        String line = cin.readLine();
	        
	        try{
	            double d = Double.valueOf(line);
	            if(d == (int)d)
	            System.out.println("This input is of type Integer.");
	            else System.out.println("This input is of type Float.");
	        }catch(Exception e){
	            System.out.println("This input is of type String.");
	        }
	    	

	   }
	}
