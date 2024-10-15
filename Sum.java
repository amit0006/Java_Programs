import java.util.Scanner;
public class Sum{
	public static void main(String[] args){
		int n;
		System.out.println("Enter the size of the array");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int ans=0;
		for(int i=0;i<n;i++){
			ans=a[i]+ans;
		}
		System.out.println("The sum of all the numebrs is "+ans);
	}
}
