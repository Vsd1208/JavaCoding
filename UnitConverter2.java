import java.util.*;
class UnitConverter2{
	public static double convertYardsToFeet(double yards){
		double feet;
		feet=yards*3;
		return feet;
	}
	public static double convertFeetToYards(double feet){
		double yards;
		yards=feet*0.333333;
		return yards;
	}
	public static double convertMetersToInches(double meters){
		double inches;
		inches=meters*39.3701;
		return inches;
	}
	public static double convertInchesToMeters(double inches){
		double meters;
		meters=inches*0.0254;
		return meters;
	}
	public static double convertInchesToCentimeters(double inches){
		double centimeters;
		centimeters=inches*2.54;
		return centimeters;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the yards::");
		double yards=sc.nextDouble();
		System.out.println("The value in feet is:"+convertYardsToFeet(yards));
    	System.out.print("Enter the feet::");
		double feet=sc.nextDouble();
		System.out.println("The value in yards is:"+convertFeetToYards(feet));
        System.out.print("Enter the meters::");
		double meters=sc.nextDouble();
		System.out.println("The value in inches is:"+convertMetersToInches(meters));
        System.out.print("Enter the inches::");
		double inches=sc.nextDouble();
		System.out.println("The value in meters is:"+convertInchesToMeters(inches));
		System.out.print("Enter the inches::");
		double inch=sc.nextDouble();
		System.out.println("The value in centimeters is:"+convertInchesToCentimeters(inch));
	}
}