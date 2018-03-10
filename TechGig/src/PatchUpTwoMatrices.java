
public class PatchUpTwoMatrices {

	public static void main(String args[] ) throws Exception {

    	BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String[] dim1= buff.readLine().split(" ");
        int row1= Integer.parseInt(dim1[0]);
        int col1= Integer.parseInt(dim1[1]);
        int[][] mat1= new int[row1][col1];
        for(int i=0; i<row1; i++){
            String[] str= buff.readLine().split(" ");
            for(int j=0; j<str.length; j++){
                mat1[i][j]=Integer.parseInt(str[j]);
            }
        }
        String[] dim2= buff.readLine().split(" ");
        int row2= Integer.parseInt(dim2[0]);
        int col2= Integer.parseInt(dim2[1]);
        int[][] mat2= new int[row2][col2];
        for(int i=0; i<row2; i++){
            String[] str= buff.readLine().split(" ");
            for(int j=0; j<str.length; j++){
                mat2[i][j]=Integer.parseInt(str[j]);
            }
        }
       // System.out.print(Arrays.deepToString(mat2));
        
        int[][] sum= new int[row1][col1];
        for(int i=0;i<row1; i++){
            for(int j=0; j<col1;j++){
                sum[i][j]=mat1[i][j]+mat2[i][j];
                if(j!=0)
                System.out.print(" ");
                System.out.print(sum[i][j]);
                
            }
           System.out.print("\n");
        }
    	//Write code here
}
   }

}
