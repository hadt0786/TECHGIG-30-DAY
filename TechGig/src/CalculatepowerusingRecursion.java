
public class CalculatepowerusingRecursion {

	static Integer pow(int b, int e){
        if(e==0) return 1;
        if(e > 0) return b*pow(b, e-1);
        
        return pow(b,e+1)/b;
    }
    
    public static void main(String args[] ) throws Exception {

    	BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
    	
    	String[] line = cin.readLine().split(" ");
    	Integer base = Integer.valueOf(line[0]);
        Integer exponent = Integer.valueOf(line[1]);
   
        System.out.println(pow(base,exponent));
        
    }
}