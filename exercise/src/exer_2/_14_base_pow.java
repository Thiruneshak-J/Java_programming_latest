package exer_2;
import java.util.Scanner;
public class _14_base_pow
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the base number:");
        int b=sc.nextInt();
        System.out.print("enter the power(expo)number:");
        int p=sc.nextInt();
        double ans=Math.pow(b,p);
        System.out.printf("the %d power of %d is : %f",b,p,ans);

    }
}
