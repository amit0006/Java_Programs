import java.util.Scanner;
public class Armstrong{
	public static void main(String[] args){
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		int a,res=0;
		int k=num;
		while(num!=0){
			a=num%10;
			res=res+(a*a*a);
			num=num/10;
		}
		System.out.println("The Armstrong of the number "+k+" is "+res);
	}
}
