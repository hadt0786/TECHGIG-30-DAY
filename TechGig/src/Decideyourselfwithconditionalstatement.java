
public class Decideyourselfwithconditionalstatement {

	public static void main(String args[] ) throws Exception {

    	BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
    	
    	int age = Integer.valueOf(cin.readLine());
    	if(age<10) {System.out.println("I am happy as having no responsibilities.");}
    	else if(age<18){System.out.println("I am still happy but starts feeling pressure of life.");}
    	if(age>=18){System.out.println("I am very much happy as i handled the pressure very well.");}

   }
}
