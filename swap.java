/*Swapping of two numbers using bitwise operator*/
class Swap
{
	public static void main(String[]  args)
	{
		int a=10;
		int b=6;
		 System.out.println("The value of a and b before swapping is "+a+" "+b);
		//For swapping we will use XOR operator
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("The value of a and b afetr swapping is "+a+" "+b);
	}
}
