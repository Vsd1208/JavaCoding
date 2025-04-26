import java.util.*;
class Harshad_number{
	public static void main(String[] args){
		int num,sum=0;
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		while(num>0){
			int k=num%10;
			num=num/10;
		sum+=k;}
		if(num/sum==0)
			System.out.println("Harshad Number");
		else
			System.out.println("Not a harshad Number");
	}
}