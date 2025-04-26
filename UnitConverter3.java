import java.util.*;
class UnitConverter3{
	public static double convertFahrenheitToCelsius(double Fahrenheit){
		double Celsius;
		Celsius=((Fahrenheit-32)*5)/9;
		return Celsius;
	}
	public static double convertCelsiusToFahrenheit(double Celsius){
		double Fahrenheit;
		Fahrenheit=((Celsius*9)/5)+32;
		return Fahrenheit;
	}
	public static double convertKilogramsToPounds(double Kilograms){
		double Pounds;
		Pounds=Kilograms*0.453592;
		return Pounds;
	}
	public static double convertPoundsToKilograms(double Pounds){
		double Kilograms;
		Kilograms=Pounds*2.20462;
		return Kilograms;
	}
	public static double convertGallonsToLitres(double Gallons){
		double Litres;
		Litres=Gallons*3.78541;
		return Litres;
	}
	public static double convertLitresToGallons(double Litres){
		double Gallons;
		Gallons=Litres*0.264172;
		return Gallons;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the degree Fahrenheit::");
		double Fahrenheit=sc.nextDouble();
		System.out.println("The value in degree Celsius is:"+convertFahrenheitToCelsius(Fahrenheit));
    	System.out.print("Enter the degree Celsius::");
		double Celsius=sc.nextDouble();
		System.out.println("The value in degree Fahrenheit is:"+convertCelsiusToFahrenheit(Celsius));
        System.out.print("Enter the value in pounds::");
		double pounds=sc.nextDouble();
		System.out.println("The value in Kilograms is:"+convertPoundsToKilograms(pounds));
        System.out.print("Enter the value in Kilograms::");
		double Kilograms=sc.nextDouble();
		System.out.println("The value in Pounds is:"+convertKilogramsToPounds(Kilograms));
		System.out.print("Enter the Gallons::");
		double Gallons=sc.nextDouble();
		System.out.println("The value in Litres is:"+convertGallonsToLitres(Gallons));
		System.out.print("Enter the value in Litres::");
		double Litres=sc.nextDouble();
		System.out.println("The value in Gallons is:"+convertLitresToGallons(Litres));
	}
}