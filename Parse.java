/*Practice of converting a string into double and finding the sum.
  The same will be applicabole for int and float also*/ 
import java.util.Scanner;
public class Parse{
	public static void main(String ...args){
		Scanner sc=new Scanner(System.in);
		String s[]=new String[5];
		System.out.println("Enter the numbers");
		for(int i=0;i<5;i++)
			s[i]=sc.next();
		double sum=0;
		for(int i=0;i<5;i++)
			sum=sum+Double.parseDouble(s[i]);
		System.out.println("The sum is "+sum);
	}
}
