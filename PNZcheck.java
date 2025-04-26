import java.util.*;
class PNZcheck {
    public static int check(int n){
	if(n>0) return 1;
	else if(n<0) return -1;
	else return 0;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int t=check(num);
		if (t==1) System.out.println("POSITIVE");
		else if(t==-1) System.out.println("NEGATIVE");
		else System.out.println("ZERO");
	}
}