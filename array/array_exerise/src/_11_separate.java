import java.util.Scanner;
import java.util.Arrays;
public class _11_separate
{
    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the size of array:");
            int n=sc.nextInt();
            int[] arr=new int[n];
            int i;
            for(i=0;i<n;i++)
            {
                System.out.print("enter the number:");
                int num=sc.nextInt();
                arr[i]=num;
            }
            System.out.print("you entered array is [");
            for(i=0;i<n;i++)
            {
                if(i!=n-1)
                {
                    System.out.printf("%d,",arr[i]);
                }
                else
                {
                    System.out.printf("%d",arr[i]);
                }
            }
            System.out.print("]\n");
            int[] pos=new int[];
            int[] neg=new int[n];
            int[] neu=new int[n];
            for(i=0;i<n;i++)
            {
                if(arr[i]>0)
                {
                    pos[i]=arr[i];
                }
                else if(arr[i]<0)
                {
                    neg[i]=arr[i];
                }
                else {
                    neu[i]=arr[i];
                }
            }
            System.out.printf("positive numbers are %s%n",Arrays.toString(pos));
            System.out.printf("negative numbers are %s%n",Arrays.toString(neg));
            System.out.printf("neutral numbers are %s%n",Arrays.toString(neu));
    }

}
