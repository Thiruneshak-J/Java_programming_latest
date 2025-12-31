import java.util.Scanner;
//recursion function
public class ques_2
{
    int rec(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        return n*rec(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ques_2 r=new ques_2();
        System.out.print("enter the number to factorial:");
        int n=sc.nextInt();
        System.out.printf("factorial of number is :%d%n",r.rec(n));
    }

}
