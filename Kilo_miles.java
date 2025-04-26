import java.util.*;
class Kilo_miles{
	public static void main(String[] args){
		double km,miles;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the kilometers::");
		km=input.nextDouble();
		//1 km=1.6 mile,1 mile=1/1.6 km
		miles=km/1.6;
		System.out.println("The total miles is "+miles+" mile for the given "+km+" km");
	}
}