import java.util.*;
class Fizz_Buzz {
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int[] arr=new int[n];
		String[] str=new String[n];
		for(int i=0;i<n;i++){
			arr[i]=obj.nextInt();
			if(arr[i]%15==0)
				str[i]="FizzBuzz";
			else if(arr[i]%5==0)
				str[i]="Buzz";
			else if(arr[i]%3==0)
				str[i]="Fizz";
		}
		for(int i=0;i<n;i++){
		System.out.println(str[i]);}
	}
}