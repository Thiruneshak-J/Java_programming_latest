import java.util.Scanner;
public class control_loop
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        //1.for loop
        System.out.print("enter the number to calculate factorial:");
        int n =sc.nextInt();
        int i;
        long temp=1;
        for(i=1;i<=n;i++)
        {
            temp*=i;
        }
        System.out.printf("factorial of %d number is %d%n",n,temp);


        //2.while loop
        int j,temp1=0;
        System.out.print("enter the number to calculate sum of series:");
        int n1=sc.nextInt();
        j=0;
        while (j<=n1)
        {
            temp1+=j;
            j++;
        }
        System.out.printf("sum of number %d is %d %n",n1,temp1);

        //3.do-while
        int k=0;
        do{
            System.out.printf("%d %n",k);
            k++;
        } while(k<0);

        //4.nested for
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //5.for-each
        String[] arr={"thiru","neshak","sns"};
        for(String ch:arr)
        {
            System.out.println(ch);
        }
        int[] arr1={1,2,3,4,5};
        for(int num:arr1)
        {
            System.out.println(num);
        }


    }
}
