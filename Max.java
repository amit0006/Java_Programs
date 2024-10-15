import java.util.Scanner;
public class Max{
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
		int max=a[0];
		for(int i=0;i<n;i++){
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("The maximum element in the array is "+max);
	}
}

