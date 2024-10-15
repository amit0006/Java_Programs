import java.util.Scanner;
public class Stack{
	int MAX;
	int top;
	int stack[];
	int item;
	Stack(/*int n*/){
		//MAX=n;
		System.out.println("Enter the size of the stack");
		Scanner sc=new Scanner(System.in);
		MAX=sc.nextInt();
		stack=new int[MAX];
		top=-1;
	}
	public static void main(String[] args){
		Stack s=new Stack(/*10*/);
		Scanner sc=new Scanner(System.in);
		int choice;
		while(true){
			System.out.println("Enter your choice\n1.For inserting an element in the stack\n2.For deleting an element in the stack\n3.For displaying the elements of the stack\n4.For exit");
			choice=sc.nextInt();
			switch(choice){
				case 1:s.push();
				       break;
				case 2:s.pop();
				       break;
				case 3:s.display();
				       break;
				case 4:System.exit(0);
				       break;
				default:System.out.println("Invalid choice\nPlease enter a valid choice");
			}
		}
	}
	void push(){
		Scanner sc=new Scanner(System.in);
		if(top==MAX-1)
			System.out.println("Stack is overflow! cannot push the element");
		else{
			System.out.println("Enter the element you want to insert");
			item=sc.nextInt();
			stack[++top]=item;
		}
	}
	void pop(){
		if(top==-1)
			System.out.println("Stack is in underflow! cannot delete the element");
		else{
			item=stack[top--];
			System.out.println("Deleting "+item+" from the stack");
		}
	}
	void display(){
		if(top==-1)
			System.out.println("Stack is empty");
		else{
			System.out.println("The stack elements are");
			for(int i=top;i>=0;i--)
				System.out.println(stack[i]);
		}
	}
}
