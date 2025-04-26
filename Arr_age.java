import java.util.*;
class Arr_age{
	public static void main(String[] args){
		int [] arr= new int [10];
		Scanner obj=new Scanner(System.in);
		for(int i=0;i<10;i++)
			arr[i]=obj.nextInt();
		for(int i=0;i<10;i++){
			if(arr[i]<0)
				System.out.println("Invalid Input");
			else if(arr[i]>=18)
				System.out.println("The student with the age "+arr[i]+" can vote.");
			else
				System.out.println("The student with the age "+arr[i]+" cannot vote.");
		}
	}
}