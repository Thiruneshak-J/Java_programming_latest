import java.util.*;
public class rotation
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter the size of array:");
        n=sc.nextInt();
        int[] arr=new int[n];
        int i,j;
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
        System.out.print("enter the side to rotate right-r or left-l:");
        char rot_s=sc.next().charAt(0);
        rot_s=Character.toLowerCase(rot_s);
        System.out.print("enter the number of rotation:");
        int rot=sc.nextInt();
        if(rot_s=='l') {
            for (i = 0; i < rot; i++) {
                for (j = 0; j < n - 1; j++) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.printf("%s",Arrays.toString(arr));
        }
        else if(rot_s=='r')
        {
            for(i=0;i<rot;i++)
            {
                for(j=n-1;j>0;j--)
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.printf("%s",Arrays.toString(arr));
        }

    }
}
