import java.util.*;
class Sumnat {
	public static int sum(int n){
		int s=0;
		for(int i=1;i<=n;i++){
		s+=i;}
		return s;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int s=sum(n);
		System.out.println("The sum of "+n+" natural numbers is "+s);
	}
}