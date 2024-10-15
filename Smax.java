import java.util.Scanner;
public class Smax{
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
		int max=a[0],smax=0,k=0;
		for(int i=0;i<n;i++){
			if(max<a[i]){
				smax=max;
				max=a[i];
				k=1;
			}
			else if(smax<a[i])
				smax=a[i];
		}
		if(k==0){
			max=a[1];
			smax=max;
			for(int i=1;i<n;i++){
                        	if(smax<a[i]){
                                	//smax=max;
                                	smax=a[i];
                        	}
                	}
		}
		System.out.println("The Second largest element in the array is "+smax);
	}
}
