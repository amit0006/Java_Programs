//Perform the addition on two matrix
import java.util.Scanner;
public class MatrixSum{
        int m,n,p,q;
        int A[][];//=new int[10][10];
        int B[][];//=new int[10][10];
        int C[][];//=new int[10][10];
	public static void main(String[] args){
                MatrixSum M=new MatrixSum();
                M.order();
                if(M.m!=M.p || M.n!=M.q)
                        System.out.println("Matrix multiplication is not possible");
                else{
                        M.read();
                        M.sum();
                        M.display();
                }
        }
        void order(){
                System.out.println("Enter the rows and columns of matrix A");
                Scanner sc=new Scanner(System.in);
                m=sc.nextInt();
                n=sc.nextInt();
                System.out.println("Enter the rows and columns of matrix B");
                p=sc.nextInt();
                q=sc.nextInt();
		A=new int[m][n];
                B=new int[p][q];
                C=new int[m][n];
        }
        void read(){
		Scanner sc=new Scanner(System.in);
                System.out.println("Enter the elements of matrix A");
                for(int i=0;i<m;i++)
                {
                        for(int j=0;j<n;j++){
                                A[i][j]=sc.nextInt();
                        }
                }
                System.out.println("Enter the value  of Matrix B");
                for(int i=0;i<p;i++)
                {
                        for(int j=0;j<q;j++){
                                B[i][j]=sc.nextInt();
                        }
                }
                 System.out.println("The elements of Matrix A are");
                for(int i=0;i<m;i++)
                {
                        for(int j=0;j<n;j++){
                                System.out.print(A[i][j]+" ");
                        }
                        System.out.println("\n");
                }
                 System.out.println("The elements of Matrix B are");
                for(int i=0;i<p;i++)
                {
                        for(int j=0;j<q;j++){
                                System.out.print(B[i][j]+" ");
                        }
                        System.out.println("\n");
                }
        }
        void sum(){
                for(int i=0;i<m;i++)
                {
                        for(int j=0;j<n;j++){
                                C[i][j]=A[i][j]+B[i][j];
                        }
                }
        }
        void display(){
                System.out.println("The resultant matrix is");
                for(int i=0;i<m;i++)
                {
                        for(int j=0;j<n;j++){
                                System.out.print(C[i][j]+" ");
                        }
                        System.out.println("\n");
                }
        }
}

