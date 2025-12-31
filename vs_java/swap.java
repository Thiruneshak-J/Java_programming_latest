import java.util.*;

public class swap
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,temp=0;
        System.out.print("enter the number a:");
        a=sc.nextInt();
        System.out.print("enter the number b:");
        b=sc.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.printf("a = %d%n",a);
        System.out.printf("b = %d%n",b);

    }

}