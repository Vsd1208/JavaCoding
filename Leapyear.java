import java.util.*;
class Leapyear{
	public static void leap(int num){
		if(num >= 1592){
			if((num%4==0&&num%100!=0)||(num%400==0))
				System.out.println("LEAP YEAR");
			else
				System.out.println("NOT A LEAP YEAR");
		}
		else
			System.out.println("OUT OF BOUNDS");
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number::");
		int num=sc.nextInt();
		leap(num); 		
	}
}