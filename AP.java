import java.util.Scanner;
public class AP{
	public static void main(String[] args){
		int n,cd;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms");
		n=sc.nextInt();
		System.out.println("Enter the common difference");
		cd=sc.nextInt();
		int f;
		System.out.println("Enter the first term");
		f=sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.print(f+" ");
			f=f+cd;
		}
		System.out.print("\n");
	}
}
