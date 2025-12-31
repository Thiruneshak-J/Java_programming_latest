package exer_2;

import java.util.Scanner;

public class _11_sum_of_n_odd
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the numbers to make sum:");
        int n = sc.nextInt();
        int temp = 0;
        int i = 0;
        while (i <= n)
        {
            if(i%2!=0)
            {
                temp += i;
                i++;
            }
            else
            {
                i++;
                continue;
            }
        }
        System.out.printf("sum of odd %d numbers is %d%n", n, temp);
    }
}
