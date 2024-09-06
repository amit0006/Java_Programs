import java.lang.*;
import java.util.Scanner;
class Cuboid
{
	public static void main(String[] args)
	{
		int length,breadth,height;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length, breadth and height respectively");
		length=sc.nextInt();
		breadth=sc.nextInt();
		height=sc.nextInt();
		int c;
		System.out.println("Enter the thing you want to know\n"+"For area of the cuboid press 1\n"+"For volume of the cuboid press 2\n"+"For perimeter of the cuboid press 3");
		c=sc.nextInt();
		if(c==1)
		{
			int area;
			area=(2*length*height)+(2*breadth*height)+(2*length*breadth);
			System.out.println("The area of the cuboid is "+area);
		}
		else if(c==2)
		{
			int volume;
			volume=length*breadth*height;
			System.out.println("The volume of the cuboid is "+volume);
		}
		else if(c==3)
		{
			int peri;
			peri=(4*length)+(4*breadth)+(4*height);
			System.out.println("The perimeter of the cuboid is "+peri);
		}
	}
}
