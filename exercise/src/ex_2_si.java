import java.util.Scanner;
public class ex_2_si
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double amount,year,r_i,si,ci;
        System.out.print("enter the principle amount:");
        amount=sc.nextDouble();
        System.out.print("enter the number of years:");
        year=sc.nextDouble();
        System.out.print("enter the rate of intrest:");
        r_i=sc.nextDouble();
        si=(amount*year*r_i)/100;
        ci=amount*Math.pow(1+(r_i/100),year);
        System.out.printf("simple intrest of amount is %.2f%n",si);
        System.out.printf("total amount of simple intrest is %.2f%n",amount+si);
        System.out.printf("compound intrest of amount is %.2f%n",ci-amount);
        System.out.printf("total amount with compound intrest is %.2f%n",ci);
    }

}
