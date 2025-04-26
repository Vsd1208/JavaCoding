import java.util.*;
class Sum_wnatural{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int n,sum1=0,i=1;
		double sum=0;
		System.out.print("Enter the number::");
		n=obj.nextInt();
		sum=(n*(n+1))/2;
		while(i<n){
		sum1+=i;
		i++;}
		System.out.println(sum1);
		System.out.println(sum);
	}
}