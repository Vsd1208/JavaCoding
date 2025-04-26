import java.util.*;
class one_two {
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int rows,columns,q=0;
		rows=obj.nextInt();
		columns=obj.nextInt();
		int[][] arr=new int[rows][columns];
		int[] array=new int[rows*columns];
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				arr[i][j]=obj.nextInt();
				array[q]=arr[i][j];
				q++;
			}
		}
		for(int i=0;i<rows*columns;i++){
			System.out.print(array[i]);
		}
	}
}