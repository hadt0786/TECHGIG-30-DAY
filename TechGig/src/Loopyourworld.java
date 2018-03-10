
public class Loopyourworld {

	public static void main(String args[] ) throws Exception {

    	BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.valueOf(cin.readLine());
    	int temp = 1;
    	while(n>=1){
    	    temp = temp*n;
    	    n = n-1;
    	}
    System.out.println(temp);
   }
}



