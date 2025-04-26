import java.util.*;
public class Sum_array{
public static void main(String[] args){
Scanner obj=new Scanner(System.in);
int i=0,sum=0,n;
System.out.println("Enter the length of the array::");
n=obj.nextInt();
int[] arr=new int[n];
System.out.println("Enter the digits::");
for(i=0;i<n;i++){
	arr[i]=obj.nextInt();
	sum+=arr[i];
}
System.out.println("The Sum of the numbers in a array of size"+n+"is"+sum);
}
}