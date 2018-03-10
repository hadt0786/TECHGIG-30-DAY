
public class PlayWithAverage {

 	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine()),i,j,num[]=new int[n],ce=0,co=0,tot;
	double se=0.0,so=0.0,ae,ao;
	String s=br.readLine();
	s=s.trim()+" ";
	String s2[]=s.split(" ");
	for(i=0;i<n;i++)
	    num[i]=Integer.parseInt(s2[i]);
	for(i=0;i<n;i++)
	{
	    if(num[i]%2==0)
	    {
	        se=se+num[i];
	        ce++;
	    }
	    else
	    {
	        so=so+num[i];
	        co++;
	    }
	}
	ae=se/ce;
	ao=so/co;
	tot=(int)Math.round(ae)+(int)Math.round(ao);
	System.out.println(tot);

}
}

}
