import java.util.*;
public class Matrix_add{
	public static void main(String[] args){
		int n,k,i,j;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number of rows in the matrix::");
		n=obj.nextInt();
		System.out.println("Enter the number of columns in the matrix::");
		k=obj.nextInt();
		int[][] arr=new int[n][k];
		int[][] arr1=new int[n][k];
		int[][] arr2=new int[n][k];
		System.out.println("Enter the elements of the first matrix::");
		for(i=0;i<n;i++){
			for(j=0;j<k;j++){
				arr[i][j]=obj.nextInt();
		}}
		System.out.println("Enter the elements of the second matrix::");
		for(i=0;i<n;i++){
			for(j=0;j<k;j++){
				arr1[i][j]=obj.nextInt();
		}}
		if (k!=n)
			System.out.println("Addition is not possible");
		else{
		System.out.println("The sum of matrices is::");
		for(i=0;i<n;i++){
			for(j=0;j<k;j++){
				arr2[i][j]=arr[i][j]+arr1[i][j];
				System.out.println(arr2[i][j]);
		}}
		}
	}
}
		
		
			
			