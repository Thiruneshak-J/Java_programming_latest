package pat;

public class pat_for_8
{
    public static void main(String[] args)
    {
        int i,j;
        System.out.println("1-pattern");
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=3;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("--------------------------------------------------------------\n");
        System.out.println("2-pattern");
        for(i=1;i<=4;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("3-pattern");
        for(i=4;i>1;i--)
        {
            for(j=1;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("4-pattern");
        int n=3;
        int k;
        for(i=n-1;i>=0;i--)
        {
            for(j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(k=i;k<n;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("5-pattern");
        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(k=n;k>i;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("6-pattern");
        for(i=n-1;i>=0;i--)
        {
            for(j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(k=i;k<n;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(k=n;k>i;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("7-pattern");
        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(k=n;k>i;k--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("7 (1)-pattern");
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("8-pattern");
        for(i=1;i<=n;i++)
        {
            for(j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=(2*i-1);k++)
            {
                    System.out.print("*");
            }
            System.out.println();
        }


    }
}
