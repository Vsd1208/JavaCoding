import java.util.*;
class Factorial{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int n,sum1=1,i=1;
		System.out.print("Enter the number::");
		n=obj.nextInt();
		for(i=1;i<=n;i++){
		sum1*=i;}
		System.out.println(sum1);
	}
}