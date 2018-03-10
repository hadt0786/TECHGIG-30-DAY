import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplicationbetweenoddandeven {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine()),i,so=0,se=0;
	String S=br.readLine();
	S=S.trim()+" ";
	String S2[];
	S2=S.split(" ");
	int num[]=new int[n];
	for(i=0;i<n;i++)
	    num[i]=Integer.parseInt(S2[i]);
	for(i=0;i<n;i++)
	{
	    if(num[i]%2==0)
	        se=se+num[i];
	    else
	        so=so+num[i];
	}
	System.out.println(so*se);

}
}
