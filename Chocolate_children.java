import java.util.*;
class Chocolate_children{
	public static void main(String[] args){
		int numberOfchocolates,numberOfchildren,cp=0,rc=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number of chocolates and number of children::");
		numberOfchocolates=obj.nextInt();
		numberOfchildren=obj.nextInt();
		cp=numberOfchocolates/numberOfchildren;
		rc=numberOfchocolates%numberOfchildren;
		System.out.println("The number of chocolates each child gets is "+cp+" and the number of remaining chocolates are "+rc);
	}
}