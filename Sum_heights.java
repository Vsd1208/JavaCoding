import java.util.*;
class Sum_heights {
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		double[] h=new double[11];
		double sum=0.0;
		for(int i=0;i<11;i++){
			h[i]=obj.nextDouble();
		sum+=h[i];}
		sum/=11;
		System.out.println(String.format("%.3f",sum));
	}
}