import java.util.*;
class Spring{
	public static void main(String[] args){
		int month,day;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter your month and day::");
		month=obj.nextInt();
		day=obj.nextInt();
		if(month>=3 && month<=6)
			System.out.println("Spring");
		else 
			System.out.println("Not Spring");
	}
}