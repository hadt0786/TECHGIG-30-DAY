
public class Playwithdigitsofanumber {

BufferedReader cin  = new BufferedReader(new InputStreamReader(System.in));
    
    String s = cin.readLine();
    
    int i =0, even = 0, odd = 0, x[] = new int[s.length()], z = Integer.parseInt(s);
    
    while(z>0){
        x[i] = z%10;
        z = z/10;
        i++;
    }
    for(i =0; i<x.length;i++){
        if(x[i]%2==0){
            even = even + x[i];
            
        }
        else{
            odd = odd + x[i];
        }
    }

   if(odd>even) System.out.println(odd-even);
    else System.out.println(even - odd);
    
   }
}

}
