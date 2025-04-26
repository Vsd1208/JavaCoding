import java.util.*;
class reverse {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int[] rev =new int[10];
		int num,k=0,i=0;
		num=obj.nextInt();
		while(num>0) {
			k=num%10;
			num/=10;
			rev[i]=k;
			i++;
		}
		for(int j=0;j<i;j++)
			System.out.print(rev[j]);
	}
}