
public class IsYourNumberNarcissistic {

	public static void main(String args[] ) throws Exception {

    	DataInputStream cin = new DataInputStream(System.in);
    	
    	int number = Integer.valueOf(cin.readLine());
    	
    	int dup = number, result =0, r, len =0,l;
    	
    	while(dup!=0){
    	    dup = dup/10;
    	    len++;
    	}
            dup = number;
            l=len;
            while(dup!=0){
                int cube = 1;
                len = l;
                r = dup%10;
                while(len!=0){
                    cube = cube*r;
                    len--;
                }
                result = result + cube;
                dup = dup/10;
                
            }
            if(result == number) {
                System.out.println("True");
                
            }else{
                System.out.println("False");
            }
   }
}
