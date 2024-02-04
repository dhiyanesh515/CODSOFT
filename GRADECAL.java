import java.util.*;
public class GRADECAL
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter total number of subjects : ");
		int noOfSub=sc.nextInt();
		int total=0;
		for(int i=1;i<=noOfSub;i++){
		    System.out.print("Enter "+i+" Subject mark : ");
		    int mark=sc.nextInt();
		    while(mark<=0 || mark>100){
		        System.out.println("Enter valid marks");
		        mark=sc.nextInt();
		    }
		    total+=mark;
		}
		double avg=(double)total/noOfSub;
		System.out.print("\nGrade : ");
		if(avg>=90){
		    System.out.println("O grade");
		}
		else if(avg>=80){
		    System.out.println("A grade");
		}
		else if(avg>=70){
		    System.out.println("B grade");
		}
		else if(avg>=60){
		    System.out.println("C grade");
		}
		else{
		    System.out.println("D grade");
		}
		System.out.println("Total : "+total);
		System.out.println("Average  Percentage : "+avg);
	}
}
