import java.util.*;
class Powerw{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt(),i=0;
		int pow=obj.nextInt(),result=1;
		while(i<pow){
		    result*=num;
			i++;}
		System.out.println(result);
	}
}