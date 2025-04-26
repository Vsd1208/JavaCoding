import java.util.*;
class Prime_number{
	public static void main(String[] args){
		int prime,count=0;
		Scanner obj=new Scanner(System.in);
		prime=obj.nextInt();
		for(int i=1;i<=prime;i++){
			if(prime%i==0)
		count++;}
	    if(count==2)
			System.out.println("Prime number");
		else
			System.out.println("Not a prime number");
	}
}