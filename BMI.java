import java.util.*;
class BMI{
	public static double bmi(double height,double weight){
		double b;
		b=(weight*10000/(height*height));
		return b;
	}
	public static String status(double bmi){
		if(bmi<=18.4)
		    return "Underweight";
		else if(bmi<=24.9)
		    return "Normal";
		else if(bmi<=39.9)
		    return "Overweight";
		else
		    return "Obese";
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    double[][] values = new double[10][3];
		String[] state = new String[10];
		for(int i=0;i<10;i++){
		    System.out.print("Enter the weight::");
		    values[i][0]=sc.nextInt();
		    System.out.print("Enter the height::");
		    values[i][1]=sc.nextInt();
			values[i][2]=bmi(values[i][0],values[i][1]);
			state[i]=status(values[i][2]);
		}
		for(int i=0;i<10;i++)
            System.out.println(""+values[i][0]+" "+values[i][1]+" "+values[i][2]+" "+state[i]);    	
	}
}