import java.util.*;
public class Pattern2{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int r,i,j;
		System.out.print("Enter the highest number of rows in pattern::");
        r=obj.nextInt();
		for(i=0;i<r;i++){
			for(j=0;j<(r-i)/2;j++)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print("*");
			for(j=0;j<(r-i)/2;j++)
				System.out.print(" ");
			System.out.println();
		}
	}
}