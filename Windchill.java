import java.util.*;
class Windchill {
    public static double calculateWindChill(double temperature,double windSpeed){
	   double windchill=35.74+0.6215*temperature+(0.4275*temperature-35.75);
       windchill*=Math.pow(windSpeed,0.16);
       return windchill;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double temperature=sc.nextDouble();
		double windSpeed=sc.nextDouble();
		double chill=calculateWindChill(temperature,windSpeed);
		System.out.println(chill);
	}
}