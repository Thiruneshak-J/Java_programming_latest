import java.util.Scanner;
public class ex_14_fibi
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("how many numbers to sample.print in fibbinocci series:");
        int num=sc.nextInt();
        int i,a=0;
        int b=1;
        System.out.printf("%d\t%d",a,b);
        for(i=3;i<=num;i++)
        {
            int c=a+b;
            a=b;
            b=c;
            System.out.printf("\t%d",c);
        }
    }
}
