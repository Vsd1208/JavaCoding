import java.util.*;
class Compare{
	public static void positive_negative(int num){
		if(num>=0)
		    System.out.println("POSITIVE");	
		else
		    System.out.println("NEGATIVE");
	}
	public static void even_odd(int num){
		if(num%2==0)
		    System.out.println("EVEN");
		else
		    System.out.println("ODD");
		System.out.println("-------XXX-------");
	}
	public static int compare(int num1,int num2){
		if(num1>num2)
		    return 1;
		else if(num1==num2)
		    return 0;
		else 
		    return -1;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of digits to be entered ::");
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		  arr[i]=sc.nextInt();
		  positive_negative(arr[i]);
		  even_odd(arr[i]);
		}
		int k=compare(arr[0],arr[n-1]);
		if(k==1)
		    System.out.println("GREATER");
		else if(k==0)
		    System.out.println("EQUAL");
		else
		    System.out.println("LESSER");
	}
}