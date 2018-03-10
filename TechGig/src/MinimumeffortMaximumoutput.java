
public class MinimumeffortMaximumoutput {

	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int n=Integer.parseInt(br.readLine()),a[]=new int[n],start=-1,end=-1;
     StringTokenizer st=new StringTokenizer(br.readLine());
     int small=0,big=0;
    for(int i=0;i<n;i++)
    {
        a[i]=Integer.parseInt(st.nextToken());
    }
    for(int i=0;i<n-1;i++)
    {
        if(a[i]>a[i+1] && start==-1)
        {
            int temp=a[i+1];
             start=i;
            int j=i-1;

        }
         if(a[i]>a[i+1] )
        {
              end=i+1;
        }   
     
    }
    small=a[start];
    big=a[end];
    for(int i=start;i<end+1 && i<n;i++)
    {
      if(small>a[i])
          small=a[i];
     
          
    }
    for(int i=0;i<start;i++)
    {
        if(a[i]>=small)
        {
            start=i;
            break;
        }
    }
    
      for(int i=start;i<=end+1 && i<n;i++)
     {
         System.out.print(a[i]);
         if(i!=end+1)
         System.out.print(" ");
     }
}
}

}
