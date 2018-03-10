
public class Counttheletters {


	public static void main(String args[] ) throws Exception {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int i=0;
        short upper=0, lower=0;
        while(i='a' && str.charAt(i)<='z') lower++;
            else if(str.charAt(i)>='A' && str.charAt(i)<='Z') upper++;
            i++;
        }
        System.out.println(upper);System.out.println(lower);
        
   }
}