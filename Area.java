import java.lang.*;
import java.util.Scanner;
class Area
{
        public static void main(String[] args)
        {
                int a,b,c;
                float s;
                double area;
                System.out.println("Enter the sides of the triangle\n");
                Scanner sc=new Scanner(System.in);
                a=sc.nextInt();
                b=sc.nextInt();
                c=sc.nextInt();
                s=(a+b+c)/2f;
                area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
                System.out.println("The area of the given triangle is "+area);
        }
}
