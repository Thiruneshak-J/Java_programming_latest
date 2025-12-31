import java.util.Scanner;
public class cts_2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[4];
        System.out.println("enter the Digits:");
        for(int i=0;i<4;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<4;i++)
        {
            System.out.printf("%d - %c\n",arr[i],arr[i]);

        }
        /*
        int[] arr_1=new int[4];
        for(int i=0;i<4;i++)
        {
            arr_1[i]=(char)arr[i];
        }
        for(int i=0;i<4;i++)
        {
            System.out.printf("%c\n",arr_1[i]);
        }
        */
    }
}
