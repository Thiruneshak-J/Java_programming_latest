import java.util.Scanner;
public class ex_4_odd_even
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.printf("the number %d is even.%n",num);
        }
        else
        {
            System.out.printf("the number %d is odd. %n",num);
        }
    }
}
