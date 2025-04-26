import java.util.*;
class Roots{
	public static void roots(int a,int b,int c){
		double delta= Math.pow(b,2)-(4*a*c);
		if(delta>=0){
		    if(delta>0){
		        double r1= ((-b + Math.sqrt(delta))/2*a);
				double r2= ((-b - Math.sqrt(delta))/2*a);
				System.out.println("The roots are::"+r1+" "+r2);
			}
			else{
			    double r1= ((-b + Math.sqrt(delta))/2*a);
				System.out.println("The root is::"+r1);
			}
		}
		else
            System.out.println("NO REAL ROOTS");
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the co-efficient of square::");
	    int a=sc.nextInt();
		System.out.print("Enter the co-efficient of linear term::");
	    int b=sc.nextInt();
		System.out.print("Enter the constant::");
	    int c=sc.nextInt();
		roots(a,b,c);
	}
}