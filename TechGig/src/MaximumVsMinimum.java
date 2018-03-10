
public class MaximumVsMinimum {

	public static void main(String args[] ) throws Exception {

    	BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(cin.readLine()), i , j, num[] = new int[n], min, max;
    	
    	String S  = cin.readLine();
    	S = S.trim()+ " ";
    	String S2 [] = S.split(" ");
    	
    	for(i = 0; imax)
                max = num[i];
            }
            
        System.out.println(min*max);
    	

   }
}

}
