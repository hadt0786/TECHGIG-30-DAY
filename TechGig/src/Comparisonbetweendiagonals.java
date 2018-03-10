
public class Comparisonbetweendiagonals {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       StringTokenizer st=new StringTokenizer(br.readLine());
	       int row=Integer.parseInt(st.nextToken()),col=Integer.parseInt(st.nextToken()),a[]=new int[row],q=-1,temp=0;
	        for(int i=0;i<row;i++)
	       {
	            StringTokenizer st1=new StringTokenizer(br.readLine());
	                    for(int j=0;j<col;j++)
	                    {
	                       a[i]=a[i]+Integer.parseInt(st1.nextToken());
	                    }
	       }
	        if(row>0 && col>0)
	            temp=a[0];
	        
	        for(int i=1;i<row;i++)
	        {
	            if(temp<a[i])
	                q=i;
	        }
	        if(q!=-1)
	        {
	            System.out.println("Row "+(q+1));
	        }
	        else
	        System.out.print("Equal");
	   }
	}