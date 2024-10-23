import java.util.Scanner;
public class MatrixM{
        int m,n,p,q,t=0;
        int A[][];
        int B[][];
        int C[][];
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int choice;
		MatrixM me=new MatrixM();
		me.order();
		me.read();
		System.out.println("Enter the your choice\n1.Press 1 for addition of two matrix\n2.Press 2 for multiplication of two matrix\n3.Press 3 for substaction of two matrix\n4. Press 4 for display\n");
		choice=sc.nextInt();
		switch(choice){
			case 1:me.sum();
			       me.print();
			       break;
			case 2:me.mult();
			       me.print();
			       break;
			case 3:me.subs();
			       me.print();
			       break;
			case 4:me.print();
			       break;
			default:System.out.println("Invalid choice");
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
        }
	void sum(){
		if(m!=p||n!=q)
			System.out.println("Addtion of two matrix is not possible");
		else{
			for(int i=0;i<m;i++){
                        	for(int j=0;j<n;j++){
                                	C[i][j]=A[i][j]+B[i][j];
                        	}
                	}
        	}
		t=1;
	}
	void subs(){
		if(m!=p||n!=q)
                        System.out.println("Addtion of two matrix is not possible");
                else{
                        for(int i=0;i<m;i++){
                                for(int j=0;j<n;j++){
                                        C[i][j]=A[i][j]-B[i][j];
                                }
                        }
                }
		t=1;
        }
	void mult(){
		if(n!=p)
			System.out.println("Matrix Multiplication is not possible");
		else{
			for(int i=0;i<m;i++){
				for(int j=0;j<q;j++){
					for(int k=0;k<n;k++){
						C[i][j]=(A[i][k]*B[k][j])+C[i][j];
					}
				}
			}
		}
		t=1;
	}
	void print(){
		if(t==0)
			System.out.println("There is no element to display");
		else{
		System.out.println("the resultant matrix is:");
		for(int i=0;i<m;i++)
                	{
                        	for(int j=0;j<n;j++){
                                	System.out.print(C[i][j]+" ");
                        	}
                        	System.out.println("\n");
                	}
		}
	}
}

