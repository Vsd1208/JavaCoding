import java.util.*;
class bmi2D{
	public static void main(String[] args){
		Scanner obj =new Scanner(System.in);
		int n;
		n=obj.nextInt();
		double[][] personData = new double[n][3];
		String[] status = new String[n];
		for(int i=0;i<n;i++){
			personData[i][0]=obj.nextInt();
			personData[i][1]=obj.nextInt();
			personData[i][2]=(personData[i][1]*10000)/(personData[i][0]*personData[i][0]);
			if(personData[i][2]<=18.4) status[i]="Underweight";
			else if(personData[i][2]<=24.9) status[i]="Normal";
			else if(personData[i][2]<=29.9) status[i]="Overweight";
			else status[i]="Obese";
		}
		for(int i=0;i<n;i++){
			System.out.println(""+"Height : "+personData[i][0]+" Weight : "+personData[i][1]+" BMI : "+personData[i][2]+" Status :"+status[i]);
		}
	}
}