import java.util.*;
class Triangle_round{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int side1,side2,side3;
		float sum=0,r=0;
		System.out.println("Enter the 3 sides of triangle::[in METERS]");
		side1=obj.nextInt();
		side2=obj.nextInt();
		side3=obj.nextInt();
		sum=(side1+side2+side3)/1000;
		r=sum/5;
		System.out.println("The total number of rounds the athlete will run is "+r+" to complete 5 km");
	}
}