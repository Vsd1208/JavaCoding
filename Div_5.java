import java.util.*;
class Div_5{
	public static void main(String[] args){
		int number;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter your number::");
		number=obj.nextInt();
		System.out.print("Is the number "+number+" divisible by 5? ");
		if(number%5==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}