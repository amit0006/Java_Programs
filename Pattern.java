public class Pattern{
	public static void main(String[] args){
		int k;
		for(int i=1;i<=9;i++){
			//k=1;
			for(k=9;k>i;k--)
                                        System.out.print(" ");
			for(int j=1;j<=i;j++){
				System.out.print("*");
				//k=k+1;
			}
			for(int m=2;m<=i;m++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
