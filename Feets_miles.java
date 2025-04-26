import java.util.*;
class Feets_miles{
	public static void main(String[] args){
		double distanceInfeet,yard,miles;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the distance in feet::");
		distanceInfeet=obj.nextDouble();
		//1 yard=3 feet
		yard=distanceInfeet/3;
		//1 mile=1760 yards
		miles=yard/1760;
		System.out.println("Your Distance in feet is "+distanceInfeet+" in yard is "+yard+" and inches is "+miles);
	}
}	