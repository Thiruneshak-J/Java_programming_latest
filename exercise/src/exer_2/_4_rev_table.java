package exer_2;

import java.util.Scanner;

public class _4_rev_table
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number to sample.print the multiplication table:");
        int n=sc.nextInt();
        System.out.print("enter the times to sample.print:");
        int n1=sc.nextInt();
        for(int i=n1;i>=0;i--)
        {
            System.out.printf("%d  * %d = %d%n",i,n,i*n);
        }
    }
}
