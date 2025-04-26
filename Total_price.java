import java.util.*;
class Total_price{
	public static void main(String[] args){
	  float unitPrice,quantity,total=0;
	  Scanner obj=new Scanner(System.in);
	  System.out.print("Enter the unit price::");
	  unitPrice=obj.nextFloat();
	  System.out.print("Enter the quantity::");
	  quantity=obj.nextFloat();
	  total=unitPrice*quantity;
	  System.out.println("The total purchase price is INR "+total+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
    }
}