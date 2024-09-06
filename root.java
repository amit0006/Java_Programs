import java.lang.*;
import java.util.Scanner;
class Area
{
        public static void main(String[] args)
        {
                int a,b,c,D;
                double r1,r2;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the value of the three coefficients\n");
                a=sc.nextInt();
                b=sc.nextInt();
                c=sc.nextInt();
                D=(b*b)-(4*a*c);
                if(D>0)
                {
                        System.out.println("The root is real\n");
                        r1=(-b+Math.sqrt(D))/(2*a);
                        r2=(-b-Math.sqrt(D))/(2*a);
                        System.out.println("The first root of the equation is "+r1);
                        System.out.println("The second root of the equation is "+r2);
                }
                else if(D<0)
                {
                        System.out.println("The root is imaginary\n");
                        double real,img;
                        real=-b/(2*a);
                        img=Math.sqrt(-1*D);
                        System.out.println("The first root of the equation is "+real+"+i"+img);
                        System.out.println("The second root of the equation is "+real+"-i"+img);
                }
                else
                {
                        System.out.println("Single root is there\n");
                        double r;
                        r=-b/(2*a);
                        System.out.println("The root of the equation is "+r);
                }
        }
}
