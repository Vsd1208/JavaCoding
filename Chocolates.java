import java.util.*;
class Chocolates {
	public static int[] findRemainderAndQuotient(int number,int divisor){
        int[] arr = new int[2];
		arr[0]=divisor/number;
		arr[1]=divisor%number;
		return arr;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students::");
		int number=sc.nextInt();
		System.out.print("Enter the number of Chocolates::");
		int divisor=sc.nextInt();
		int[] arr=findRemainderAndQuotient(number,divisor);
		System.out.println("The number of chocolates each student gets is "+arr[0]+" and the remaining chocolates are "+arr[1]);
	}
}