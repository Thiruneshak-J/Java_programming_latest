import java.util.Scanner;
public class ex_6_roots
{
    public static void main(String[] args)
    {
        //ax^2+bx+c=0
        //d=b^2-4ac
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        System.out.print("enter the coffient of x^2:");
        a=sc.nextDouble();
        System.out.print("enter the coffient of x:");
        b=sc.nextDouble();
        System.out.print("enter the constant:");
        c=sc.nextDouble();
        if(a==0)
        {
            System.out.print("x^2=0 then roots invaild");
        }
        else {
            double d = (b * b) - 4 * a * c;
            if (d > 0) {
                double root1, root2;
                root1 = (-b + (Math.sqrt(d))) / (2 * a);
                root2 = (-b - (Math.sqrt(d))) / (2 * a);
                System.out.printf("the roots of equation %.0fx^2+%.0fx+%.0f are %.2f and %.2f%n",a,b,c,root1,root2);
            } else if (d == 0) {
                double root = -b / (2 * a);
                System.out.printf("the roots of equation %.0fx^2+%.0fx+%.0f are %.2f",a,b,c,root);
            } else {
                double real,img;
                real= -b / (2 * a);
                img=Math.sqrt(-d)/(2*a);
                System.out.printf("the real and imaginary roots of equation %.0fx^2+%.0fx+%.0f are (%.2f,%.2f) and(%.2f,%.2f)%n",a,b,c,real,img,real,-img);
            }
        }
    }
}
