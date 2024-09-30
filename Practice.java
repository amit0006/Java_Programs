import java.util.Scanner;
public class Practice{
	public static void main(String[] args){
		int num1,num2;
		int res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two operands");
		num1=sc.nextInt();
		num2=sc.nextInt();
		String op;
		System.out.println("Enter the operator i.e. ADD, SUBS, MULTI, DIVIDE");
		sc.nextLine();
		op=sc.nextLine();
		res=0;
		switch(op){
			case "ADD":res=num1+num2;
				   break;
			case "SUBS":res=num1-num2;
				    break;
			case "MULTI":res=num1*num2;
				     break;
			case "DIVIDE":{
					      if(num2!=0){
						      res=num1/num2;
					      }
					      else
						      System.out.println("Cannot divide by zero");
			}
			default:System.out.println("Invalid choice");
		}
		System.out.println("The result is "+res);
	}
}
