import java.util.*;
class Armstrong{
	public static void main(String[] args){
		int num,sum=0;
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		while(num>0){
			int k=num%10;
			num/=10;
		sum+=k*k*k;}
		if(sum==num)
			System.out.println("Armstrong Number");
		else
	System.out.println("Not a Armstrong Number");}
}