import java.util.*;
class Distance_time{
	public static void main(String[] args){
		String fromCity,viaCity,toCity;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the departure city::");
		fromCity=obj.nextLine();
		System.out.print("Enter the via city::");
		viaCity=obj.nextLine();
		System.out.print("Enter the destination city::");
		toCity=obj.nextLine();
		int t1,t2,t=0,t3=0;
		System.out.print("Enter the time taken to reach "+viaCity+"::[in Minutes]");
		t1=obj.nextInt();
		System.out.print("Enter the time taken from "+viaCity+" to reach "+toCity+"::[in Minutes]");
		t2=obj.nextInt();
		double d1,d2,d=0;
		System.out.print("Enter the distance to reach "+viaCity+"::[in MILES]");
		d1=obj.nextDouble();
		System.out.print("Enter the distance from "+viaCity+" to reach "+toCity+"::[in MILES]");
		d2=obj.nextDouble();
		t=t1+t2;
		t3=t%60;
		t=t/60;
		d=d1+d2;
		System.out.print("The total time taken to reach "+toCity+" from "+fromCity+" via "+viaCity+"is "+t+" hours "+t3+" minutes");
		System.out.print("The total distance travelled to reach "+toCity+" from "+fromCity+" via "+viaCity+"is::[in MILES]"+d);
	}
}