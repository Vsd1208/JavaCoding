import java.util.*;
class frequency{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num,k;
		num=sc.nextInt();
		int[] arr = new int[10];
		while(num>0){
			k=num%10;
			arr[k]++;
			num/=10;
		}
		for(int i=0;i<10;i++)
	System.out.println("The frequency of "+i+" is "+arr[i]);}
}