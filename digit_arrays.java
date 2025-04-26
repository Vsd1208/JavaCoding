import java.util.*;
class digit_arrays {
	public static void main(String[] args) {
		int num,i=0,k,max=0;
		Scanner obj = new Scanner(System.in);
		int[] digit = new int[10];
		int[] temp = new int[20];
		num=obj.nextInt();
		while(num>0){
			k=num%10;
			num/=10;
			digit[i]=k;
			i++;
			if(i==9 && num/10!=0){
				k=num%10;
				num/=10;
				temp[i+9]=k;
				i++;
			}
		}
		int q=i;
		for(int j=0;j<10;j++)
			temp[j]=digit[j];
		for(int j=1;j<q;j++){
			for(int p=0;p<j;p++){
				if(temp[p]>temp[j]){
					max=temp[p];
					temp[p]=temp[j];
					temp[j]=max;
		}}}
		
		System.out.println(""+temp[q-1]+" "+temp[q-2]);
	}
}