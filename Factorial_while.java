import java.util.*;
class Factorial_while{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int n,sum1=1,i=1;
		System.out.print("Enter the number::");
		n=obj.nextInt();
		while(i<=n){
		sum1*=i;
		i++;}
		System.out.println(sum1);
	}
}