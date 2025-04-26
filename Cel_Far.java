import java.util.*;
class Cel_Far{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		double celcius,fahrenheit=0;
		System.out.print("Enter the degree temperature in celcius::");
		celcius=obj.nextDouble();
		fahrenheit=(celcius*9)/5 + 32;
		System.out.println("The "+celcius+" celsius is "+fahrenheit+" fahrenheit");
	}
}