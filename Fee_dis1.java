import java.util.*;
class Fee_dis1{
	public static void main(String[] args){
	    Scanner input=new Scanner(System.in);
		int fee;
		double discountPercent=0,disf=0,ff=0;
		System.out.print("Enter the fee::");
		fee=input.nextInt();
		System.out.print("Enter the discount::");
		discountPercent=input.nextDouble();
		disf=(fee*discountPercent)/100;
		ff=fee-disf;
		System.out.println("The discount amount is INR "+disf+" and final discounted fee is INR "+ff);
	}
}

