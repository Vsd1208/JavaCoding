import java.util.*;
class bmi {
	public static void main(String[] args){
		Scanner obj =new Scanner(System.in);
		int n;
		n=obj.nextInt();
		int[] height = new int[n];
		int[] weight = new int[n];
		double[] bmi = new double[n];
		String[] status = new String[n];
		for(int i=0;i<n;i++){
			height[i]=obj.nextInt();
			weight[i]=obj.nextInt();
			bmi[i]=(weight[i]*10000)/(height[i]*height[i]);
			if(bmi[i]<=18.4) status[i]="Underweight";
			else if(bmi[i]<=24.9) status[i]="Normal";
			else if(bmi[i]<=29.9) status[i]="Overweight";
			else status[i]="Obese";
		}
		for(int i=0;i<n;i++){
			System.out.println(""+"Height : "+height[i]+" Weight : "+weight[i]+" BMI : "+bmi[i]+" Status :"+status[i]);
		}
	}
}