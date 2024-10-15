import java.util.Scanner;
public class Fib{
	public static void main(String[] args){
		int n;
		int a=0,b=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms to print");
		n=sc.nextInt();
		if(n==0)
			System.out.println("Invalid choice");
		else if(n==1)
			System.out.println(a);
		else{
			System.out.print(a+" ");
			System.out.print(b+" ");
			for(int i=2;i<n;i++){
				int c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
			}
		}
		System.out.print("\n");
	}
}
