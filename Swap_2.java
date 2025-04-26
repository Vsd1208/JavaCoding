import java.util.*;
class Swap_2{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int number1,number2,t=0;
		System.out.print("Enter the two numbers::");
		number1=obj.nextInt();
		number2=obj.nextInt();
		t=number1;
		number1=number2;
		number2=t;
		System.out.println("The swapped numbers are  "+number1+" and "+number2);
	}
}