//Display the numbers entered by the user in words
import java.util.Scanner;
public class Word{
	static void word(int x){
		String s[]=new String[100];
		int i=0;
		while(x!=0){
			int rev=x%10;
			switch(rev){
				case 0:s[i]="Zero";
				       break;
				case 1:s[i]="one";
				       break;
				case 2:s[i]="two";
				       break;
				case 3:s[i]="three";
				       break;
				case 4:s[i]="four";
				       break;
				case 5:s[i]="five";
				       break;
				case 6:s[i]="six";
				       break;
				case 7:s[i]="seven";
				       break;
				case 8:s[i]="eight";
				       break;
				case 9:s[i]="nine";
				       break;
				default:System.out.println("Invalid");
			}
			x=x/10;
			i++;
		}
		for(int j=i-1;j>=0;j--){
			System.out.print(s[j]+" ");
		}
		System.out.println();
	}
	public static void main(String ...args){
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		x=sc.nextInt();
		word(x);
	}
}
