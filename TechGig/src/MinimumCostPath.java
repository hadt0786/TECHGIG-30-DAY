import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class MinimumCostPath {
    private static void floodMatrix(int i,int j,int[][] mat,int[][] low,int value){
		if(i<0||i>=mat.length||j<0||j>=mat[0].length)
			return;
		int temp=value+mat[i][j];
		if(temp<low[i][j]){
			low[i][j]=temp;
			floodMatrix(i,j-1,mat,low,temp);
			floodMatrix(i,j+1,mat,low,temp);
			floodMatrix(i-1,j-1,mat,low,temp);
			floodMatrix(i-1,j,mat,low,temp);
			floodMatrix(i-1,j+1,mat,low,temp);
			floodMatrix(i+1,j-1,mat,low,temp);
			floodMatrix(i+1,j,mat,low,temp);
			floodMatrix(i+1,j+1,mat,low,temp);
		}
	}
	public static void main(String[] args) {
		try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))){
			String[] temp=reader.readLine().split(" ");
			int m=Integer.parseInt(temp[0]);
			int n=Integer.parseInt(temp[1]);
			int[][] mat=new int[m][n];
			int[][] low=new int[m][n];
			for(int i=0;i<m;i++){
				Arrays.fill(low[i], 1001);
				temp=reader.readLine().split(" ");
				for(int j=0;j<n;j++){
					mat[i][j]=Integer.parseInt(temp[j]);
				}
			}
			//temp=reader.readLine().split(" ");
			int x=m-1;//Integer.parseInt(temp[0]);
			int y=n-1;//Integer.parseInt(temp[1]);
			floodMatrix(0,0,mat,low,0);
			System.out.println(low[x][y]);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}