import java.util.*;
class Triangle{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		double height,base,h_inch,b_inch,area_cm,area_inch,h_feet;
		System.out.println("Enter the height and base of the triangle in cm::");
		height=obj.nextDouble();
		base=obj.nextDouble();
		//1 inch=2.5 cm
		//1 feet=12 inch
		area_cm=0.5*height*base;
		h_inch=height/2.5;
		b_inch=base/2.5;
		area_inch=0.5*h_inch*b_inch;
		System.out.println("Area in cm="+area_cm);
		System.out.println("Area in inch="+area_inch);
		h_feet=height/30;
		h_inch=height%30;
		System.out.println("The height in cm "+height+" in Feet "+h_feet+" and inches "+h_inch);
	}
}
