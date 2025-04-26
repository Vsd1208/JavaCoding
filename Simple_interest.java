import java.util.*;
class Simple_interest{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int principle,time;
		float rate,simpleinterest=0;
		System.out.println("Enter the principle amount,time period & rate of interest::");
		principle=obj.nextInt();
		time=obj.nextInt();
		rate=obj.nextFloat();
		simpleinterest=(principle*time*rate)/100;
		System.out.println("The Simple Interest is "+simpleinterest+" for Principal "+principle+", Rate of Interest "+rate+" and Time "+time);
	}
}
