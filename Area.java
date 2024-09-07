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
/*import java.util.Scanner;

class Area {
    public static void main(String[] args) {
        int a, b, c;
        float s;
        double area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sides of the triangle:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // Closing the scanner after use
        sc.close();

        // Calculating semi-perimeter
        s = (a + b + c) / 2f;

        // Using Heron's formula to calculate the area
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Printing the area
        System.out.printf("The area of the given triangle is %.2f\n", area);
    }
}*/

