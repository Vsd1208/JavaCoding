import java.util.*;
class Quorem {
	public static int[] findRemainderAndQuotient(int number,int divisor){
        int[] arr = new int[2];
		arr[0]=number/divisor;
		arr[1]=number%divisor;
		return arr;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		int divisor=sc.nextInt();
		int[] arr=findRemainderAndQuotient(number,divisor);
		System.out.println(""+arr[0]+" "+arr[1]);
	}
}