import java.util.*;
class grade {
	public static void main(String[] args){
		Scanner obj =new Scanner(System.in);
		int n;
		n=obj.nextInt();
		int[] physics = new int[n];
		int[] chemistry = new int[n];
		int[] maths = new int[n];
		double[] per  = new double[n];
		String[] status = new String[n];
		String[] g = new String[n];
		for(int i=0;i<n;i++){
			physics[i]=obj.nextInt();
			chemistry[i]=obj.nextInt();
			maths[i]=obj.nextInt();
			per[i]=(physics[i]+chemistry[i]+maths[i])/3;
			if(per[i]>=80) {
				status[i]="Level 4, above agency-normalized standards";
			g[i]="A";}
			else if(per[i]>=70){
				status[i]="Level 3, at agency-normalized standards";
			g[i]="B";}
			else if(per[i]>=60){
				status[i]="Level 2, below, but approaching agency-normalized standards";
			g[i]="C";}
			else if(per[i]>=50){
				status[i]="Level 1, well below agency-normalized standards";
			g[i]="D";}
			else if(per[i]>=40){
				status[i]="Level 1-, too below agency-normalized standards";
			g[i]="E";}
			else {
				status[i]="Remedial standards";
			g[i]="R";}
		}
		for(int i=0;i<n;i++){
			System.out.println(""+"Maths : "+maths[i]+" Physics : "+physics[i]+" Chemistry : "+chemistry[i]+" Percentage : "+per[i]+" Grade : "+g[i]+" Remarks :"+status[i]);
		}
	}
}