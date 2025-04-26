import java.util.*;
class Det_mat{
	public static void main(String[] args){
		int n,m,i,j;
		int[][] arr = new int[10][10];
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the number of rows::");
		n=obj.nextInt();
		System.out.print("Enter the number of columns::");
		m=obj.nextInt();
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				arr[i][j]=obj.nextInt();
			}
		    System.out.println();
		}
	}
}