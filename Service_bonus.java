import java.util.*;
class Service_bonus{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the years of service of the Employee::");
		int year=obj.nextInt();
		System.out.print("Enter the salary of the Employee::");
		double salary=obj.nextDouble();
		if(year>5){
			double bonus=salary*0.05;
			System.out.println("The bonus of the employee is::"+bonus);
		}
		else
			System.out.println("Service less than 5 years");
	}
}
