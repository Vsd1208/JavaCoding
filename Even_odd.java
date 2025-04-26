import java.util.*;
class Even_odd{
	public static void main(String[] args){
		int number;
		Scanner obj=new Scanner(System.in);
		number=obj.nextInt();
		for(int i=1;i<=number;i++){
			if(i%2==0)
				System.out.println("EVEN");
			else
				System.out.println("ODD");
		}
	}
}