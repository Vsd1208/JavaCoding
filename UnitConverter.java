import java.util.*;
class UnitConverter{
	public static double k2m(double km){
		double miles;
		miles=km*0.621371;
		return miles;
	}
	public static double m2k(double miles){
		double km;
		km=miles*1.60934;
		return km;
	}
	public static double m2f(double meters){
		double feet;
		feet=meters*3.28084;
		return feet;
	}
	public static double f2m(double feet){
		double meters;
		meters=feet*0.621371;
		return meters;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the kilometers::");
		double km=sc.nextDouble();
		System.out.println("The value in miles is:"+k2m(km));
    	System.out.print("Enter the miles::");
		double miles=sc.nextDouble();
		System.out.println("The value in kilometers is:"+m2k(miles));
        System.out.print("Enter the meters::");
		double meters=sc.nextDouble();
		System.out.println("The value in feets is:"+m2f(meters));
        System.out.print("Enter the feets::");
		double feets=sc.nextDouble();
		System.out.println("The value in meters is:"+f2m(feets));		
	}
}