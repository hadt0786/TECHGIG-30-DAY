import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BiggestDigitInANumber {

	
	public static void main(String[] args) throws IOException {
	
	BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
	
	String S = cin.readLine();
	int i =0;
	
	int x[] = new int[S.length()];
	int z  = Integer.parseInt(S);
	
	while(z>0){
	    x[i] = z%10;
	    z = z/10;
	    i++;
	}
	Arrays.sort(x);
	System.out.println(x[i-1]);

}
}



