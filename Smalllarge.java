import java.util.*;
class Smalllarge {
	public static int[] findSmallestAndLargest(int number1,int number2,int number3){
        int[] arr = new int[2];
		if(number1>number2 && number2>number3){
		arr[0]=number3;
		arr[1]=number1;}
		else if(number1>number3 && number3>number2){
		arr[0]=number2;
		arr[1]=number1;}
		else if(number2>number3 && number3>number1){
		arr[0]=number1;
		arr[1]=number2;}
		else if(number2>number1 && number1>number3){
		arr[0]=number3;
		arr[1]=number2;}
		else if(number3>number2 && number2>number1){
		arr[0]=number1;
		arr[1]=number3;}
		else{
		arr[0]=number2;
		arr[1]=number3;}
		return arr;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int number3=sc.nextInt();
		int[] arr=findSmallestAndLargest(number1,number2,number3);
		System.out.println(""+arr[0]+" "+arr[1]);
	}
}