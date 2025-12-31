import java.util.Arrays;
import java.util.Scanner;
public class rotate_array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            System.out.print("enter the number:");
            arr[i]=sc.nextInt();
        }
        System.out.printf("entered array is %s%n",Arrays.toString(arr));
        System.out.print("enter the times to rotate:");
        int t=sc.nextInt();
        System.out.print("enter the side to rotate:");
        String side=sc.next();
        if(side.equalsIgnoreCase("left")){
            for (i = 0; i < t; i++) {
                for (j = 0; j < n - 1; j++) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        else if(side.equalsIgnoreCase("right"))
        {
            for(i=0;i<t;i++)
            {
                for(j=n-1;j>0;j--)
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        else
        {
            System.out.printf("array %s",Arrays.toString(arr));
        }
        System.out.printf("array rotated %s%n", Arrays.toString(arr));
    }

}
