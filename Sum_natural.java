import java.util.*;
class Sum_natural{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int n,sum1=0;
		double sum=0;
		System.out.print("Enter the number::");
		n=obj.nextInt();
		sum=(n*(n+1))/2;
		for(int i=1;i<=n;i++){
		sum1+=i;}
		System.out.println(sum1);
		System.out.println(sum);
	}
}