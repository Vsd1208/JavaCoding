import java.util.*;
class Height_age{
	public static void main(String[] args){
		int h1,h2,h3,a1,a2,a3;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the heights::");
		h1=obj.nextInt();
		h2=obj.nextInt();
		h3=obj.nextInt();
		System.out.println("Enter the ages::");
		a1=obj.nextInt();
		a2=obj.nextInt();
		a3=obj.nextInt();
		if(h1>h2 && h1>h3)
			System.out.println(""+h1+" is Greatest");
		else if(h2>h1 && h2>h3)
			System.out.println(""+h2+" is Greatest");
		else
			System.out.println(""+h3+" is Greatest");
		if(a1<a2 && a1<a3)
			System.out.println(""+a1+" is Smallest");
		else if(a2<a1 && a2<a3)
			System.out.println(""+a2+" is Smallest");
		else
			System.out.println(""+a3+" is Smallest");
	}
}			