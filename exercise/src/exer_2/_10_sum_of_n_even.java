package exer_2;
import java.util.Scanner;
public class _10_sum_of_n_even
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
            if(i%2==0)
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
        System.out.printf("sum of even %d numbers is %d%n", n, temp);
    }
}

