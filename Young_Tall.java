import java.util.*;
class Young_Tall{
	public static int young(int[] age){
		int y=Integer.MAX_VALUE;
		for(int i=0;i<3;i++){
		    if(age[i]<y)
			    y=age[i];
		}
		return y;
	}
	public static int tall(int[] height){
		int h=Integer.MIN_VALUE;
		for(int i=0;i<3;i++){
		    if(height[i]>h)
			    h=height[i];
		}
		return h;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    int[] age = new int[3];
		int[] height = new int[3];
		System.out.println("Enter the ages::");
		for(int i=0;i<3;i++)
		    age[i]=sc.nextInt();
		System.out.println("Enter the heights::");
		for(int i=0;i<3;i++)
		    height[i]=sc.nextInt();    
        System.out.println(""+young(age)+" "+tall(height));    	
	}
}