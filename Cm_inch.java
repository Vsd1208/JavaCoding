import java.util.*;
class Cm_inch{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int height;
		double inch=0,feet=0;
		System.out.println("Enter Your Height in cm::");
        height=obj.nextInt();
	 	inch=height/2.54;
		feet=inch/12;
		System.out.println("Your Height in cm is "+height+" while in feet is "+feet+" and inches is "+inch);
	}
}