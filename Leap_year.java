import java.util.*;
class Leap_year{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int year=obj.nextInt();
		if(year>=1582){
		  if(((year%4==0)&&(year%100!=0))||(year%400==0))
		System.out.println("Leap year");}
		else{
			System.out.println("Not a Georgian year");
	    }
	}
}	