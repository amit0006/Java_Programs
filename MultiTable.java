import java.util.Scanner;
public class MultiTable{
	public static void main(String[] args){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number whose multiplication table you want");
		n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" x "+i+" = "+(n*i));
		}
	}
}
