
public class BinaryToDecimal {
/*
	Sample TestCase 1
	Input
	110
	Output
	6*/
	public static void main(String args[] ) throws Exception {

	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	          String temp=br.readLine();
	          String s="";
	          int sum=0,temp1=1;
	          for(int i=temp.length()-1;i>=0;i--)
	          {
	              s=s+temp.charAt(i);
	              
	          }
	          for(int i=0;i<s.length();i++)
	          {
	              
	              char c=s.charAt(i);
	              if(c=='1')
	              {
	                  if(i==0)
	                      sum=sum+1;
	                  else
	                  {
	                      if(i==1)
	                        temp1=2;
	                      else
	                        temp1=temp1*2;
	                       sum=sum+temp1;
	                        }
	                       
	               }
	              else if(i>=1)
	                  
	                  temp1=temp1*2;
	                     
	           } 
	                  
	        
	          System.out.println(sum);
	        
	   }
	}

}
