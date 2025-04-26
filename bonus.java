import java.util.*;
class bonus {
	public static void main(String[] args) {
		double[] sald = new double[10];
		double[] yrs = new double[10];
		double[] bon = new double[10];
		double[] saln = new double[10];
		double total_bonus=0,total_old=0,total_new=0;
		Scanner obj = new Scanner(System.in);
		for(int i=0;i<10;i++){
			System.out.print("Enter the salary of "+(i+1)+" Employee :");
			sald[i]=obj.nextDouble();
			System.out.print("Enter the service of "+(i+1)+" Employee :");
			yrs[i]=obj.nextDouble();
			if(sald[i] <= 0||yrs[i] <= 0){
				System.out.println("Invalid Entry");
		    i--;}
		}
		for(int i=0;i<10;i++){
			total_old+=sald[i];
			if(yrs[i]>5){
				bon[i]=sald[i]*0.05;
				total_bonus+=bon[i];
				saln[i]=sald[i]+bon[i];
				total_new+=saln[i];
		    }
		    else{
				bon[i]=sald[i]*0.02;
				total_bonus+=bon[i];
				saln[i]=sald[i]+bon[i];
				total_new+=saln[i];
		}}
		System.out.println("The total bonus to be paid is : "+total_bonus);
		System.out.println("The total salary without bonus is : "+total_old);
		System.out.println("The total salary with bonus is : "+total_new);
	}
}

				