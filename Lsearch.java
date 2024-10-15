import java.util.Scanner;
public class Lsearch{
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
		System.out.println("The elements you have enetered are");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
		System.out.println("Enter the key element to search");
		int key;
		key=sc.nextInt();
		int i,k=0;
		for(i=0;i<n;i++){
			if(key==a[i]){
				k=1;
				break;
			}
			else
				k=0;
		}
		if(k==0)
			System.out.println("The key does not found in the array");
		else
			System.out.println(key+" is found at location "+(i+1));
	}
}
