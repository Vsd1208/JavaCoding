import java.util.*;
class IntOperation{
	public static void main(String[] args){
		int a,b,c;
		float d=0,e=0,f=0,g=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the 3 numbers::");
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		d=a + b *c;
		e=a * b + c;
		f=c + a / b;
		g=a % b + c;
		System.out.println("The results of Int Operations are "+d+","+e+","+f+" and "+g);
	}
}
		