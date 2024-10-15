import java.util.Scanner;
public class GP{
        public static void main(String[] args){
                int n,r;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number of terms");
                n=sc.nextInt();
                System.out.println("Enter the common ratio");
                r=sc.nextInt();
                int f;
                System.out.println("Enter the first term");
                f=sc.nextInt();
                for(int i=0;i<n;i++){
                        System.out.print(f+" ");
                        f=f*r;
                }
                System.out.print("\n");
        }
}
