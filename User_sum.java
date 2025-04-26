import java.util.*;
class User_sum{
	public static void main(String[] args){
		int sum=0;
		Scanner obj=new Scanner(System.in);
		while(sum>=0){
			int number=obj.nextInt();
			if(number==0)
				break;
			else
				sum+=number;
		}
		System.out.println(sum);
	}
}		