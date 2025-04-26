import java.util.*;
class Pos_neg_zero{
	public static void main(String[] args){
		int number;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter your number::");
		number=obj.nextInt();
		if(number>0)
			System.out.println("Positive");
		else if(number<0)
			System.out.println("Negative");
		else
		System.out.println("Zero");
	}
}