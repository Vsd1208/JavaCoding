import java.util.*;
//Creating a class named Calculator to perform Arithmetic operations
//The first line is to import scanner class.
class Switch_Cal{
	public static void main(String[] args){
		float number1,number2;
		char ch;
		Scanner obj=new Scanner(System.in);
		//Taking the input from users 
		ch=obj.next().charAt(0);
		System.out.print("Enter the first Number::");
		number1=obj.nextFloat();
		System.out.print("Enter the second Number::");
		number2=obj.nextFloat();
		float add,sub,mul,div,mod;
		add=number1+number2;//sum of two numbers
		sub=number1-number2;//difference of two numbers
		mul=number1*number2;//product of two numbers
		div=number1/number2;//quotient of two numbers
		mod=number1%number2;//remainder of two numbers
		switch (ch){
		    case '+':
			    System.out.println(add);
			    break;
			case '-':
			    System.out.println(sub);
				break;
			case '*':
			    System.out.println(mul);
				break;
			case '/':
			    System.out.println(div);
				break;
			case '%':
			    System.out.println(mod);
				break;
	}
}
}