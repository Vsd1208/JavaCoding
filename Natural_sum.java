import java.util.*;
class Natural_sum{
	public static void main(String[] args){
		int n,sum=0;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the number::");
		n=obj.nextInt();
		if(n>0){
			for(int i=1;i<=n;i++)
				sum+=i;
			System.out.println("The sum of "+n+" natural numbers is "+sum);
		}
		else
			System.out.println("Not a Natural Number");
	}
}