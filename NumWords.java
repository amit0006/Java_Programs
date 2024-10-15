import java.util.Scanner;
public class NumWords{
	public static void main(String[] args){
		int num,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		String str=null;
		while(num>0){
			r=num%10;
			str=str+r;
			num=num/10;
		}
		for(int i=str.length()-1;i>=0;i--){
			char c=str.charAt(i);
			switch(c){
				case '0':System.out.print("Zero ");
					 break;
				case '1':System.out.print("One ");
                                         break;
				case '2':System.out.print("Two ");
                                         break;
				case '3':System.out.print("Three ");
                                         break;
				case '4':System.out.print("Four ");
                                         break;
				case '5':System.out.print("Five ");
                                         break;
				case '6':System.out.print("Six ");
                                         break;
				case '7':System.out.print("Seven ");
                                         break;
				case '8':System.out.print("Eight ");
                                         break;
				case '9':System.out.print("Nine ");
                                         break;
			}
		}
		System.out.print("\n");
	}
}
