import java.util.*;
class Profit_loss{
	public static void main(String[] args){
		int cp=129,sp=191,profit=0;
		double p_per=0;
		profit=sp-cp;
		p_per=(profit*100)/cp;
		System.out.println("The Cost Price is INR "+cp+" and Selling Price is INR "+sp+"\n The Profit is INR "+profit+" and the Profit Percentage is "+p_per);
	}
}
