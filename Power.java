import java.util.*;
class Power{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int pow=obj.nextInt(),result=1;
		for(int i=0;i<pow;i++)
		    result*=num;
		System.out.println(result);
	}
}