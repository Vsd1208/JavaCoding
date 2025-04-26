import java.util.*;
class DoubleOpt{
	public static void main(String[] args){
		double a,b,c;
		double d=0,e=0,f=0,g=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the 3 numbers::");
		a=obj.nextDouble();
		b=obj.nextDouble();
		c=obj.nextDouble();
		d=a + b *c;
		e=a * b + c;
		f=c + a / b;
		g=a % b + c;
		System.out.println("The results of Int Operations are "+d+","+e+","+f+" and "+g);
	}
}		