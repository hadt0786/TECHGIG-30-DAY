
public class GCDoftwonumbers {

	static int gcd(int num1, int num2){
        int a = (num1>num2 ? num1:num2);
        int b = (a==num1?num2:num1);
        
        int r = b;
        
        while(a%b!=0){
            r = a%b;
            a= b;
            b =r;
        }
        return r;
    }

    public static void main(String args[] ) throws Exception {
        
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
    
        String[] in = cin.readLine().trim().split(" ");
        int a = Integer.parseInt(in[0]);
        int b = Integer.parseInt(in[1]);
    
        System.out.println(gcd(a,b));
   }
}

}
