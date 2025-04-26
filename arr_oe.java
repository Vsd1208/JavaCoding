import java.util.*;
class arr_oe {
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int n,p=0,q=0;
		System.out.print("Enter the total number of digits being entered:");
		n=obj.nextInt();
		int[] dig=new int[n];
		int[] odd=new int[n];
		int[] even=new int[n];
		for(int i=0;i<n;i++){
			dig[i]=obj.nextInt();
			if(dig[i]%2==0){
				even[p]=dig[i];
			p++;}
			else{
			    odd[q]=dig[i];
			q++;}
		}
		for(int i=0;i<q;i++)
        System.out.println(odd[i]);
	    for(int i=0;i<p;i++)
        System.out.println(even[i]);
	}
}	