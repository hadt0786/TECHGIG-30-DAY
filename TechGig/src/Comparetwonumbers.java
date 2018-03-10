import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Comparetwonumbers {
		
	public static void main(String[] args) {
	
	BufferedReader cin  = new BufferedReader(new InputStreamReader(System.in));
	
	StringTokenizer st = new StringTokenizer(cin.readLine());
	int a = Integer.parseInt(st.nextToken()),
	    b = Integer.parseInt(st.nextToken()),
	    aSum = 0,
	    bSum = 0,
	    aCopy = a, 
	    bCopy = b;
	    
	    while(a>0){
	        aSum = aSum + a%10;
	        a = a/10;
	    }
	    while(b>0){
	        bSum = bSum + b%10;
	        b = b/10;
	    }
	    if(aSum>bSum) System.out.println(aCopy);
	    else {
	        if (aSum < bSum) System.out.println(bCopy);
	        else System.out.println("Equal");
	    }

}
}


}
