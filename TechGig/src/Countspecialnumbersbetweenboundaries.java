import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Countspecialnumbersbetweenboundaries {

	public static void isDivisible(int start, int end){
        int count = 0;
        int num = start;
        while(start!=end){
            if(start%num==0)
            count++;
        }System.out.println(count);
    }
        public static void main(String args[] ) throws Exception {

        	BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        	
        	int start = Integer.valueOf(cin.readLine());
        	int end = Integer.valueOf(cin.readLine());
            
                isDivisible(start, end);
            
                Bring back power-supplyBring back power-supply
        }
    }
            
        
           	
    }


}
