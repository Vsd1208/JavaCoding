import java.util.*;
public class Pattern{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int r,i=0;
		System.out.println("Enter the highest number of rows::");
		r=obj.nextInt();
		for(i=0;i<r;i++){
			for(int j=0;j<i+1;j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
			