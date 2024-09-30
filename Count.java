import java.util.Scanner;
public class Count{
	public static void main(String[] args){
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		int a,count=0;
		while(num!=0){
			a=num%10;
			num=num/10;
			count++;
		}
		System.out.println("The number of digits in this number is "+count);
	}
}
