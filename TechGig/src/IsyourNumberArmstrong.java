
public class IsyourNumberArmstrong {

	public static void main(String args[] ) throws Exception {

    	BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.valueOf(cin.readLine());
    	
    	int no= n;
        int sum=0;
        for(;n>0;){
            int i=n%10;
            sum=sum +(i*i*i);
            n=n/10;
        }
        if(sum == no){
            System.out.println("True");
        }
        else
        System.out.println("False");
   }
}
