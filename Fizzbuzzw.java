import java.util.*;
class Fizzbuzzw{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the number::");
		int n=obj.nextInt(),i=1;
		while(i<n){
			if(i%3==0 && i%5==0)
			System.out.println("FizzBuzz");
			else if(i%3==0 && i%5!=0)
			System.out.println("Fizz");
			else if(i%3!=0 && i%5==0)
			System.out.println("Buzz");
			else
			System.out.println(i);
		i--;}
	}
}