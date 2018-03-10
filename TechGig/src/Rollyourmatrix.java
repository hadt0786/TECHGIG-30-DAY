
public class Rollyourmatrix {


BufferedReader buff= new  BufferedReader(new InputStreamReader(System.in));
        
        String[] in= buff.readLine().split(" ");
        int rows=Integer.parseInt(in[0]);
        int cols=Integer.parseInt(in[1]);
        int[][] matrix= new int[rows][cols];
        
        int[][] trans= new int[cols][rows];
        for(int i=0; i<rows;  i++){
            String[] str= buff.readLine().split(" ");
            for(int j=0; j<cols; j++){
                matrix[i][j]=Integer.parseInt (str[j]);
                trans[j][i]=Integer.parseInt(str[j]);
            }
        }
        
        for(int i=0; i<cols;  i++){
            
            for(int j=0; j<rows; j++){
                if(j!=0)
                System.out.print(" ");
            
                System.out.print(trans[i][j]);
            }
            if(i!=cols-1)
            System.out.print("\n");
        }
    	//Write code here

   }
}

}
