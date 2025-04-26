import java.util.*;
class Fee_dis{
	public static void main(String[] args){
		int fee=125000;
		double disp=0.1,disf=0,ff=0;
		disf=fee*disp;
		ff=fee-disf;
		System.out.println("The discount amount is INR "+disf+" and final discounted fee is INR "+ff);
	}
}

