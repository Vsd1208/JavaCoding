import java.util.*;
class Handshakes{
	public static void main(String[] args){
		int num,t=0;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the number of persons::");
		num=obj.nextInt();
		t=(num*(num-1))/2;
		System.out.println(t);
	}
}