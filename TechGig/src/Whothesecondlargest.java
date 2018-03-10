
public class Whothesecondlargest {
	public static void main(String args[] ) throws Exception {

    	BufferedReader cin = new BufferedReader (new InputStreamReader(System.in));
    	
    	int t = Integer.valueOf(cin.readLine());
    	
    	String [] a = cin.readLine().split(" ");
        Integer[] arr = new Integer[t];
        
        for(int i =0; i<t;i++){
            arr[i] = Integer.valueOf(a[i]);
        }
        Arrays.sort(arr);
        System.out.println(arr[t-2]);
    	
   }
}

	
}
