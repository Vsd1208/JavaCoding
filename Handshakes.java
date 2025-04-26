import java.util.*;
class  Handshakes{
    public static int shake(int n){
	    int t= (n*(n-1))/2;
		return t;
		}
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter the number of Students::");
	   int n=sc.nextInt();
	   int t=shake(n);
	   System.out.print("The Total number of Handshakes is "+t);
	   }
}