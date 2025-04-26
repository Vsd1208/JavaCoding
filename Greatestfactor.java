import java.util.*;
class Greatestfactor{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt(),greatestFactor=0;
		for(int i=1;i<n;i++){
			if(n%i==0){
			   if(i>=greatestFactor)
			      greatestFactor=i;}
		}
		System.out.println(greatestFactor);
	}
}