import java.util.*;
class Small_3{
	public static void main(String[] args){
		int a,b,c;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		System.out.print(" Is the first number the smallest? ");
		if((a<b && b<c)|| (a<c && c<b))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}