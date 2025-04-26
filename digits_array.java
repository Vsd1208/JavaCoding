import java.util.*;
class digits_array {
	public static void main(String[] args) {
		int num,i=0,k,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		Scanner obj = new Scanner(System.in);
		int[] digit = new int[10];
		num=obj.nextInt();
		while(num>0){
			k=num%10;
			num/=10;
			digit[i]=k;
			i++;
		}
		int q=i+1;
		for(int j=0;i<q;j++){
			if(min>digit[i])
				min=digit[i];
			if(max<digit[i])
				max=digit[i];
		}
		System.out.println(""+min+" "+max);
	}
}