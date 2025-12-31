import java.util.Scanner;
//swap-with third variable
public class ex_1_swap
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the value a :");
        int a = sc.nextInt();
        System.out.print("enter the value of b:");
        int b = sc.nextInt();
        System.out.printf("a = %d%n",a);
        System.out.printf("b = %d%n",b);
        int c=a;
        int d=b;
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.print("after swap with temp:\n");
        System.out.printf("a = %d%n",a);
        System.out.printf("b = %d%n",b);
        System.out.println("-----------------------------------------------------");
        System.out.printf("c = %d%n",c);
        System.out.printf("d = %d%n",d);
        c=c+d;
        d=c-d;
        c=c-d;
        System.out.print("after swap without temp:\n");
        System.out.printf("c = %d%n",c);
        System.out.printf("d = %d%n",d);
        sc.close();
    }

}
