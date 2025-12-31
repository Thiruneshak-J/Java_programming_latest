package pat;
public class pat_do_while_8
{
    public static void main(String[] args)
    {
        int i,j,n=3;
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("1-pattern");
        i=0;
        do
        {
            j=0;
            do
            {
                System.out.print("*");
                j++;
            }while(j<3);
            System.out.println();
            i++;
        }while(i<3);

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("2-pattern");
        i=1;
        do
        {
            j=0;
            do {
                System.out.print("*");
                j++;
            }while(j<i);
            System.out.println();
            i++;
        }while(i<=n);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("3-pattern");
        i=n;
        do
        {
            j=0;
            do {
                System.out.print("*");
                j++;
            }while(j<i);
            System.out.println();
            i--;
        }while(i>0);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("4-pattern");
        i=n;
        do
        {
            j=0;
            do
            {
                System.out.print(" ");
                j++;
            }while(j<i);
            int k=i;
            do
            {
                System.out.print("*");
                k++;
            }while(k<=n);
            System.out.println();
            i--;
        }while(i>0);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("5-pattern");
        i=0;
        do
        {
            j=0;
            do
            {
                System.out.print(" ");
                j++;
            }while(j<=i);
            int k=n-1;
            do
            {
                System.out.print("*");
                k--;
            }while(k>=i);
            System.out.println();
            i++;
        }while(i<n);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("6-pattern");
        i=n;
        do
        {
            j=0;
            do
            {
                System.out.print(" ");
                j++;
            }while(j<i);
            int k=i;
            do
            {
                System.out.print("*");
                k++;
            }while(k<=n);
            System.out.println();
            i--;
        }while(i>0);
        i=0;
        do
        {
            j=0;
            do
            {
                System.out.print(" ");
                j++;
            }while(j<=i);
            int k=n-1;
            do
            {
                System.out.print("*");
                k--;
            }while(k>=i);
            System.out.println();
            i++;
        }while(i<n);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("7-pattern");
        i=n;
        do
        {
            j=0;
            do
            {
                System.out.print(" ");
                j++;
            }while(j<i);
            int k=i;
            do
            {
                System.out.print(" *");
                k++;
            }while(k<=n);
            System.out.println();
            i--;
        }while(i>0);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("8-pattern");
        i=0;
        do
        {
            j=i;
            do
            {
                System.out.print(" ");
                j++;
            }while(j<n);
            int k=0;
            do
            {
                System.out.print("*");
                k++;
            }while(k<=2*i);
            System.out.println();
            i++;
        }while(i<n);
    }
}
