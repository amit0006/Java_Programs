import java.util.Scanner;
public class Reverse{
	public static void main(String[] args){
		int num,rev=0,digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		int or=num;
		while(num>0){
			digit=num%10;
			rev=(rev*10)+digit;
			num=num/10;
		}
		System.out.println("The reverse number is "+rev);
		if(or==rev)
			System.out.println("The number is palendrom");
		else
			System.out.println("The number is not a palendrome");
	}
}
