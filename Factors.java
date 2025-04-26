import java.util.*;
class Factors{
	public static int[] factors(int num){
        int[] arr = new int[num];
		int j=0;
		for (int i=1;i<=num;i++){
		    if(num%i==0){
				arr[j]=i;
                j++;
			}
		}			
		return arr;
	}
	public static int sum_factors(int[] arr,int num){
		int sum=0;
		for(int i=0;i<num;i++)
			sum+=arr[i];
		return sum;
	}
	public static double pro_factors(int[] arr,int num){
		int pro=1;
		for(int i=0;i<num;i++)
			if(arr[i]!=0)
			  pro*=arr[i];
		return pro;
	}
	public static double pow_factors(int[] arr,int num){
		int sum=0;
		for(int i=0;i<num;i++)
			sum+=Math.pow(arr[i],2);
		return sum;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the angle::");
		int num=sc.nextInt();
		int[] arr1=factors(num);
		int sum=sum_factors(arr1,num);
		double pro=pro_factors(arr1,num);
		double sump=pow_factors(arr1,num);
		System.out.println("The factors are:"+Arrays.toString(arr1));
		System.out.println("The sum of factors is:"+sum);
        System.out.println("The product of factors is:"+pro);
        System.out.println("The sum of squares of factors is:"+sump); 		
	}
}