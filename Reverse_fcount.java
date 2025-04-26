import java.util.*;
class Reverse_count {
	public static void main(String[] args){
		int number,i=0;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the number::");
		number=obj.nextInt();
		for(i=number;number>0;number--)
		    if(number%i==0)
			System.out.println(number);
	}
}