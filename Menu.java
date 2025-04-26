import java.util.*;
class Menu{
public static void main(String[] args){
	Scanner obj=new Scanner(System.in);
	int marks;
	System.out.print("Enter the marks out of 100::");
	marks=obj.nextInt();
	if(marks>=80){
		System.out.println("Grade A");
	    System.out.println("Level 4,above agency-normalized standards");}
	else if(marks>=70){
		System.out.println("Grade B");
	System.out.println("Level 3,at agency-normalized standards");}
	else if(marks>=60){
		System.out.println("Grade C");
	System.out.println("Level 2,below,but approaching agency-normalized standards");}
	else if(marks>=50){
		System.out.println("Grade D");
	System.out.println("Level 1, well below agency-normalized standards");}
	else if(marks>=40){
		System.out.println("Grade E");
		System.out.println("Level 1-, too below agency-normalized standards");
	}
	else{
		System.out.println("Grade R");
	System.out.println("Remedial standards");}
}
}