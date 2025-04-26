import java.util.*;
class Vol_km_miles{
	public static void main(String[] args){
		int r=6378;
		double vr=0,vrm=0,rm=0;
		//1 km=0.621 mile,n km=n*0.621 mile
		rm=r*0.621;
		vr=(4/3)*(22/7)*r*r*r;
		vrm=(4/3)*(22/7)*rm*rm*rm;
		System.out.println("The volume of earth in cubic kilometers is "+vr+" and cubic miles is "+vrm);
    }
}	