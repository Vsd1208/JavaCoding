import java.util.*;
class StudentVoteChecker{
	public static boolean canStudentVote(int age){
		if(age >= 18)
			return true;
		else
			return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    int[] age = new int[10];
		System.out.println("Enter the ages::");
		for(int i=0;i<10;i++){
		    age[i]=sc.nextInt();
		    boolean vote=canStudentVote(age[i]);
            if (vote==true)
                System.out.println("CAN VOTE");
            else
                System.out.println("CANNOT VOTE");
		}			
	}
}