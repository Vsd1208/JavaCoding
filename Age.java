import java.util.*;
class Age{
	public static void main(String[] args){
		int age,birth_yr;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the birth year ::");
		birth_yr=obj.nextInt();
		age=2024-birth_yr;
		System.out.println("Harry's age in 2024 is "+age);
}}