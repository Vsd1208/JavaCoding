import java.util.*;
class Trignometry {
	public static double[] calculateTrigonomatricFunctions(double angle){
        double[] arr = new double[3];
		double radian=Math.toRadians(angle);
		arr[0]=Math.sin(radian);
		arr[1]=Math.cos(radian);
		arr[2]=Math.tan(radian);
		return arr;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the angle::");
		double number=sc.nextDouble();
		double[] arr=calculateTrigonomatricFunctions(number);
		System.out.printf("The Sine value is %.2f",arr[0]);
		System.out.printf("\n The cosine value is %.2f",arr[1]);
		System.out.printf("\n The Tangent value is %.2f",arr[2]);
	}
}