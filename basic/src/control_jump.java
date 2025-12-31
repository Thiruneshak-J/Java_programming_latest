import java.util.Scanner;

public class control_jump
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //1.break
        for(int j=0;j<5;j++)
        {
            System.out.println(j);
            if(j==3)
            {
                break;
            }
        }
        int[] arr={2,3,4,32,4,54,87};
        int i,len=arr.length;
        boolean f=false;
        System.out.print("enter the number to find:");
        int n=sc.nextInt();
        for(i=0;i<len;i++)
        {
            if(arr[i]==n)
            {
                System.out.printf("found %d in index %d",n, i);
                f=true;
                break;
            }
        }
        if(!f)
        {
            System.out.printf("sorry, %d is not found%n",n);
        }

        //2.continue
        for(i=0;i<=5;i++)
        {
            if(i==3)
            {
                continue;
            }
            System.out.println(i);
        }
        return;     // return statement
        //System.out.println("using return jump statement");
    }

}
