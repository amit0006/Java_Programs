import java.util.Scanner;
public class Fnumber{
	public static void main(String[] args){
		int n;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number till which you have to find the sum");
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
			sum=sum+i;
		}
		System.out.println("The sum of "+n+" natural numbers is "+sum);
	}
}
