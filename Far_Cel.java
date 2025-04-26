import java.util.*;
class Far_Cel{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		double celcius=0,fahrenheit;
		System.out.print("Enter the degree temperature in celcius::");
		fahrenheit=obj.nextDouble();
		celcius=((fahrenheit-32)*5)/9;
		System.out.println("The "+fahrenheit+" fahrenheit is "+celcius+" celcius");
	}
}