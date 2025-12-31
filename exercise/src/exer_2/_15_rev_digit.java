package exer_2;

import java.util.Scanner;

public class _15_rev_digit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        int rev=0,rem,num;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        System.out.printf("rev of digit is %d",rev);
    }
}
