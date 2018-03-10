
public class Warbetweenoddandeven {

	public static void main(String args[] ) throws Exception {

    	BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(cin.readLine()), i ,j ,num[] = new int[n],so = 0, se = 0;
    	
    	String S = cin.readLine();
    	S = S.trim()+ " ";
    	String [] S2 = S.split(" ");
    	for(i =0; i<n;i++)
    	    num[i] = Integer.parseInt(S2[i]);
    	for(i=0;i<n;i++){
    	    if(i%2==0)
    	            se = se+ num[i];
    	            else
    	            so = so + num[i];
    	}
    	if(so>se)
    	    System.out.println(so-se);
    	    else System.out.println(se-so);
   }
}

}
