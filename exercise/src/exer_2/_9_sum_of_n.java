package exer_2;
import java.util.Scanner;
public class _9_sum_of_n {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the numbers to make sum:");
        int n = sc.nextInt();
        int temp = 0;
        int i = 1;
        while (i <= n) {
            temp += i;
            i++;
        }
        System.out.printf("sum of %d numbers is %d%n", n, temp);
    }
}