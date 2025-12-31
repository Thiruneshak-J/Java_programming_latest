import java.util.Scanner;
public class opera
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number a");
        int a=sc.nextInt();
        System.out.print("enter the number b:");
        int b=sc.nextInt();
        int c=a/b;
        System.out.println("1.arithmetic operator:");
        System.out.printf("addition of a and b %d%n",a+b);
        System.out.printf("subtraction of a and b is %d%n",a-b);
        System.out.printf("multiplication of a and b is %d%n",a*b);
        System.out.printf("division of a and b is %d%n",c);
        System.out.printf("modules of a and b is %d%n",a%b);
        System.out.println("2.assignment operator:");
        a=10;
        System.out.printf("addition assignment of a is %d%n",a+=2);
        System.out.printf("subtraction assignment of a is %d%n",a-=3);
        System.out.printf("multiplication assignment of a is %d%n",a*=2);
        System.out.printf("division assignment of a is %d%n",a/=2);
        System.out.printf("modules assignment of a is %d%n",a%=2);
        System.out.println("3.relational and comparison operator:");
        a=10;
        b=20;
        System.out.printf("value of a is %d and value of b is %d%n",a,b);
        System.out.printf("is a==b ? %b%n",a==b);
        System.out.printf("is a!=b  ? %b%n",a!=b);
        System.out.printf("is a>b ? %b%n",a>b);
        System.out.printf("is a>=2 ? %b%n",a>=2);
        System.out.printf("is a<b ? %b%n",a<b);
        System.out.printf("is a<=b ? %b%n",a<=b);
        System.out.println("4.logical operator:");
        System.out.printf("checking two condition with AND : %b%n",(a<b && a>=2));
        System.out.printf("checking two condition with OR : %b%n",(a<b || a>=20));
        System.out.printf("checking condition with NOT : %b%n",!(a>b));
        System.out.println("5.unary operator:");
        a=23;
        System.out.printf(" positive a (+a) = %d%n",+a);
        System.out.printf(" negative a (-a) = %d%n",-a);
        System.out.printf(" pre increment a (++a) = %d%n",++a);
        System.out.printf(" post increment a (a++) = %d%n",a++);
        System.out.printf(" printing a after post increment = %d%n",a);
        System.out.printf(" pre decrement (--a) = %d%n",--a);
        System.out.printf(" post decrement (a--) = %d%n",a--);
        System.out.printf(" printing a after post decrement = %d%n",a);
        System.out.println("6.bitwise operator:");
        a=3;
        b=5;
        System.out.printf("a & b : %d%n",a&b);
        System.out.printf("a | b : %d%n",a|b);
        System.out.printf("a ^ b : %d%n",a^b);
        System.out.printf("~ a : %d%n",~a);
        System.out.printf("a<<1: %d%n",a<<1);
        System.out.printf("a >> 1 : %d%n",a>>1);
        System.out.println("ternary operator :");
        System.out.print("enter the age:");
        int age=sc.nextInt();
        String res=(age>18) ? "adult" : "-18";
        System.out.print(res);
        sc.close();
    }
}
