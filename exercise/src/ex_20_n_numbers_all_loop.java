import java.util.Scanner;
public class ex_20_n_numbers_all_loop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,temp=0;
        int i;
        System.out.print("enter the numbers to make sum:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            temp+=i;
        }
        System.out.printf("sum of %d numbers is %d%n",n,temp);

        System.out.print("enter the numbers to make sum:");
        n=sc.nextInt();
        temp=0;
        i=1;
        while(i<=n)
        {
            temp+=i;
            i++;
        }
        System.out.printf("sum of %d numbers is %d%n",n,temp);

        System.out.print("enter the numbers to make sum:");
        n=sc.nextInt();
        temp=0;
        i=1;
        do
        {
            temp+=i;
            i++;
        }while(i<=n);
        System.out.printf("sum of %d numbers is %d%n",n,temp);
        sc.close();
    }

}
