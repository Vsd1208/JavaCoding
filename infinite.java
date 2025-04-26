import java.util.*;
class infinite {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		double[] arr=new double[10];
		double total=0.0;
		int i=0;
		while(true){
			if(i<10){
				arr[i]=obj.nextDouble();
				if(arr[i]<=0) break;
				i++;
			}
			else break;
		}
		for(int j=0;j<10;j++)
			total+=arr[j];
		System.out.println(total);
	}
}