
public class PlayWithOperators {

	public static void main(String args[] ) throws Exception {

	    BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
	    
	    Double a = Double.valueOf(cin.readLine());
	    int b = Integer.valueOf(cin.readLine());
	    int c = Integer.valueOf(cin.readLine());
	    int simpleInterest = (int)(a*b*c)/100 ;
	    System.out.println(simpleInterest);
	    
	   }

}
