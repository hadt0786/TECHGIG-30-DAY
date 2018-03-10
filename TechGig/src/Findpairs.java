
public class Findpairs {

	
	static boolean findSum(int[] arr, int sum){
        Arrays.sort(arr);
        int l =0, r =arr.length-1;
        while(l<r){
            if(arr[l]+arr[r]==sum)return true;
            else if(arr[l]+arr[r]<sum) l++;
            else r--;
        }
        return false;
    }
    
    
    public static void main(String args[] ) throws Exception {

            BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
            
            int n = Integer.parseInt(cin.readLine());
            String[] str = cin.readLine().trim().split(" ");
            
            int[] arr = new int[n];
            
            for(int i =0; i < n ; i++){
                arr[i] = Integer.parseInt(str[i]);
            }
            int sum = Integer.parseInt(cin.readLine());
            System.out.println((findSum(arr,sum)?"True":"False"));
   }
}

	
	
}
