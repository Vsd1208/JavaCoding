import java.util.*;
class Quo_rem{
	public static void main(String[] args){
		float number1,number2,quo=0,rem=0;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the number1::");
		number1=obj.nextFloat();
		System.out.print("Enter the number2::");
		number2=obj.nextFloat();
		quo=number1/number2;
		rem=number1%number2;
		System.out.println("The Quotient is "+quo+" and Reminder is "+rem+" of two number "+number1+" and "+number2);
	}
}