import java.util.*;
class Int_digits{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int num,count=0;
		System.out.print("Enter the number:");
		num=obj.nextInt();
		while(num>0){
			int k=num%10;
			num=num/10;
			if(k>=0||k<0)
				count++;
		}
		System.out.println("The number of digits is "+count);
	}
}