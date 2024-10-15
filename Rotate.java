import java.util.Scanner;
public class Rotate{
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
		int b[]=new int[n];
		System.out.println("Enter you choice\n1.Press 1 for left rotation\n2.Press 2 for right rotation");
		int x;
		x=sc.nextInt();
		if(x==1){
			for(int i=1;i<n;i++)
				b[i-1]=a[i];
			b[i]=a[0];
		}
		else if(x==2){
			for(int i=0;i<n;i++)
				b[i+1]=a[i];
			b[0]=a[i];
		}
	}
}
