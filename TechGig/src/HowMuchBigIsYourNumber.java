
public class HowMuchBigIsYourNumber {

	public static void main(String args[] ) throws Exception {

    	BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.valueOf(cin.readLine());
    	int count = 0;
    	while(n>0){
    	     n= n/10;
    	    count=count+1;
    	}
    	System.out.println(count);

   }
}