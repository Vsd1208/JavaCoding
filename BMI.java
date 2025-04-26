import java.util.*;
class BMI{
	public static void main(String[] args){
		double weight,height,bmi;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the Weight of the person::");
		weight=obj.nextDouble();
		System.out.print("Enter the Height of the person [in CM]::");
		height=obj.nextDouble();
		bmi=10000*weight/(height*height);
		if(bmi<=18.4)
			System.out.println("Underweight");
		else if(bmi<=24.9)
			System.out.println("Normal");
		else if(bmi<=39.9)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
}}