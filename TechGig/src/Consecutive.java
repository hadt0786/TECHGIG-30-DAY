import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Consecutive {
		
	public static void main(String [] args) throws NumberFormatException, IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String s=br.readLine();
		String a[]=s.split(" ");
		int A[]=new int[n];
		for(int i=0;i<n;++i)
		A[i]=Integer.parseInt(a[i]);
		int min=A[0];int max=A[0];
		for(int i=0;i<n;++i)
	{	if(min>A[i])
		min=A[i];
		if(max<A[i])
		max=A[i];}
		boolean result=areConsecutive(A, n);
		if (result == true)
	            System.out.println("True");
	            else
	             System.out.println("False");

	   }
	 public static  boolean areConsecutive(int arr[],int n)
	   {   
	       int max =arr[0],min = arr[0];
	       if (n < 1)
	            return false;
	 
	         if (max - min + 1 == n) 
	        {
	            /* Create a temp array to hold visited flag of all elements.
	               Note that, calloc is used here so that all values are initialized 
	               as false */
	            boolean visited[] = new boolean[n];
	            int i;
	            for (i = 0; i < n; i++) 
	            {
	                /* If we see an element again, then return false */
	                if (visited[arr[i] - min] != false)
	                    return false;
	 
	                /* If visited first time, then mark the element as visited */
	                visited[arr[i] - min] = true;
	            }
	             
	            /* If all elements occur once, then return true */
	            return true;
	        }
	        return false;



	   }
	}
