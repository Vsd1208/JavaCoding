import java.util.*;
class Vote_age{
	public static void main(String[] args){
		int age;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the age of the candidate:");
		age=obj.nextInt();
		if(age>=18)
			System.out.println("The person's age is "+age+" and can vote.");
		else
	        System.out.println("The person's age is "+age+" and cannot vote.");
}
}