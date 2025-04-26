import java.util.*;
class Spring {
    public static boolean season(int m){
	  boolean k=false;
	  if(m>=3 && m<=6) k=true;
	  return k;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month::");
		int m=sc.nextInt();
		boolean t=season(m);
		if (t==true)
			System.out.println("Its a Spring Season");
		else
			System.out.println("Not a Spring Season");
	}
}