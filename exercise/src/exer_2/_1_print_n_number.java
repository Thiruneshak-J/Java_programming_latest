package exer_2;

import java.util.Scanner;
public class _1_print_n_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.print("enter the numbers to sample.print:");
        n = sc.nextInt();
        for (i = 0; i <= n; i++) {
            System.out.printf("%d ",i);
        }


    }
}
