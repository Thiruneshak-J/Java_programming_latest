import java.util.Scanner;
public class ex_18_sum_of_digit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number to sum of digits:");
        int n=sc.nextInt();
        int rev,rem,num;
        int sum=0;
        while(n>0)
        {
            rem=n%10;
            sum+=rem;
            n/=10;
        }
        System.out.printf("sum of digits is %d",sum);
    }

}
