import java.util.*;
class Perimeter{
	public static void main(String[] args){
		double side,perimeter=0;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the side of the Square:");
		side=obj.nextDouble();
		//perimeter=side*4
		perimeter=side*4;
		System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
	}
}

