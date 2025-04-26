import java.util.*;
class age_height {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int h = Integer.MIN_VALUE;
		int a = Integer.MAX_VALUE;
		int[] age = new int[3];
		int[] height = new int[3];
		for(int i=0;i<3;i++){
			age[i]=obj.nextInt();
		    if(a>age[i])
		a=age[i];}
		for(int i=0;i<3;i++){
			height[i]=obj.nextInt();
		      if(h<height[i])
		h=height[i];}
	    System.out.println(""+a+" "+h);
	}
}