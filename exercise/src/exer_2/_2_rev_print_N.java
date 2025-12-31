package exer_2;

import java.util.Scanner;

public class _2_rev_print_N
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.print("enter the numbers to sample.print:");
        n = sc.nextInt();
        for (i=n;i>=0;i--) {
            System.out.printf("%d ",i);
        }
    }
}

