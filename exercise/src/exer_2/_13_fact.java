package exer_2;

import java.util.Scanner;

public class _13_fact
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number to calculate factorial:");
        int n =sc.nextInt();
        int i;
        long temp=1;
        for(i=1;i<=n;i++)
        {
            temp*=i;
        }
        System.out.printf("factorial of %d number is %d%n",n,temp);
    }
}
