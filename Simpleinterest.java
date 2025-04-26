import java.util.*;
class  Simpleinterest{
	public static float si(int p,int r,int t){
		float sim=(p*r*t)/100;
	return sim;}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int p,r,t;
		System.out.print("Enter the Principle Amount::");
		p=sc.nextInt();
		System.out.print("Enter the rate of interest::");
		r=sc.nextInt();
		System.out.print("Enter the time period::");
		t=sc.nextInt();
		float s=si(p,r,t);
		System.out.println("The Simple Interest is "+s+" for Principal "+p+", Rate of Interest "+r+" and Time"+t);
	}
}