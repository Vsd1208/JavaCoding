import java.util.*;
class Rounds {
    public static int rounds(int a,int b,int c){
	    int t=a+b+c;
		int r=5000/t;
	return r;}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sides of Triangle::");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int r=rounds(a,b,c);
		System.out.println("The total number of rounds is "+r);
	}
}