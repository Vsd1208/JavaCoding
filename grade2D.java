import java.util.*;
class grade2D {
	public static void main(String[] args){
		Scanner obj =new Scanner(System.in);
		int n;
		n=obj.nextInt();
		double[][] per  = new double[n][4];
		String[] status = new String[n];
		String[] g = new String[n];
		for(int i=0;i<n;i++){
			per[i][0]=obj.nextInt();
			per[i][1]=obj.nextInt();
			per[i][2]=obj.nextInt();
			per[i][3]=(per[i][0]+per[i][1]+per[i][2])/3;
			if(per[i][3]>=80) {
				status[i]="Level 4, above agency-normalized standards";
			g[i]="A";}
			else if(per[i][3]>=70){
				status[i]="Level 3, at agency-normalized standards";
			g[i]="B";}
			else if(per[i][3]>=60){
				status[i]="Level 2, below, but approaching agency-normalized standards";
			g[i]="C";}
			else if(per[i][3]>=50){
				status[i]="Level 1, well below agency-normalized standards";
			g[i]="D";}
			else if(per[i][3]>=40){
				status[i]="Level 1-, too below agency-normalized standards";
			g[i]="E";}
			else {
				status[i]="Remedial standards";
			g[i]="R";}
		}
		for(int i=0;i<n;i++){
			System.out.println(""+"Maths : "+per[i][2]+" Physics : "+per[i][0]+" Chemistry : "+per[i][1]+" Percentage : "+per[i][3]+" Grade : "+g[i]+" Remarks :"+status[i]);
		}
	}
}