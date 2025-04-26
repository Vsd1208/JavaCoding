import java.util.*;
public class Menu_driven {
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a String::");
		String str=obj.nextLine();
		int n1=0,n2=0,n3=0,n4=0,n5=0,i;
		int l=str.length();
		str=str.toLowerCase();
		for(i=0;i<l;i++){
			char ch=str.charAt(i);
			if(ch=='a')
				n1++;
			else if(ch=='e')
				n2++;
			else if(ch=='i')
				n3++;
			else if(ch=='o')
				n4++;
			else if(ch=='u')
				n5++;
		}
		System.out.println("The number of 'a/A' in the sentence::"+n1);
		System.out.println("The number of 'e/E' in the sentence::"+n2);
		System.out.println("The number of 'i/I' in the sentence::"+n3);
		System.out.println("The number of 'o/O' in the sentence::"+n4);
		System.out.println("The number of 'u/U' in the sentence::"+n5);
	}
}		
