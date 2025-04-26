import java.util.*;
public class Bank_details{
	public static void main(String[] args){
		int cus_id;
		double ac;
		String name,ifsc;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your name::");
		name=obj.nextLine();
		System.out.println("Enter your Account Number::");
		ac=obj.nextDouble();
		System.out.println("Enter your IFSC code::");
		ifsc=obj.nextLine();
		System.out.println("Enter your customer ID::");
		cus_id=obj.nextInt();
		System.out.println("------------------------XXXXX------------------------");
		System.out.println("The Details of "+name+" are as follows::");
		System.out.println("Account Number is::"+ac);
		System.out.println("IFSC code Number is::"+ifsc);
		System.out.println("Customer ID is::"+cus_id);
	}
}

		
		