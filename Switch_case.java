import java.util.*;
class Check{
	public static void add(int a,int b){
	System.out.println(a+b);}
	public static void sub(int a,int b){
	System.out.println(a-b);}
	public static void mul(int a,int b){
	System.out.println(a*b);}
	public static void div(int a,int b){
	System.out.println(a/b);}
	public static void mod(int a,int b){
	System.out.println(a%b);}
	public static void values(){
		Scanner obj=new Scanner(System.in);
		int a,b;
		char ch;
		System.out.print("Enter the value of first number::");
		a=obj.nextInt();
		System.out.print("Enter the value of second number::");
		b=obj.nextInt();
		System.out.print("Enter the operator::");
		ch=obj.next().charAt(0);
		switch(ch){
		   case '+':
                add(a,b);
                break;
           case '-':
                sub(a,b);
                break;
           case '*':
                mul(a,b);
                break;	
           case '/':
                div(a,b);
                break;	
           case '%':
                mod(a,b);
                break;	
           default:
                System.out.println("NOT POSSIBLE");
                break;
        }
    }
}
class Switch_case{
    public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the number of operations to be performed::");
		int n=obj.nextInt();
		for(int i=0;i<n;i++){
			Check Sc=new Check();
		    Sc.values();
		}
	}
}		