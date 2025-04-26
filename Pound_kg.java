import java.util.*;
class Pound_kg{
	public static void main(String[] args){
		double pound,kg=0;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the weight::");
		pound=obj.nextDouble();
		kg=pound/2.2;
		System.out.println(kg);
	}
}