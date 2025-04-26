import java.util.*;
class Natural_sum{
	public static int sum_n(int num){
		int sum=0;
		sum+=num;
		if (num==0)
		  return 0;			
		return num+sum_n(num-1);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the angle::");
		int num=sc.nextInt();
		int s=sum_n(num);
		double sum=(num*(num+1))/2;
        System.out.println(sum+" "+s); 		
	}
}