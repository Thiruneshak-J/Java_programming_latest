import java.util.Arrays;
import java.util.Scanner;
public class rem_dup
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i,j;
        i=0;
        while(i<n)
        {
            System.out.print("enter the number:");
            int num=sc.nextInt();
            arr[i]=num;
            i++;
        }
        System.out.print("array is [");
        i=0;
        while(i<n)
        {
            if(i!=n-1)
            {
                System.out.printf("%d,",arr[i]);
            }
            else
            {
                System.out.printf("%d",arr[i]);
            }
            i++;
        }
        System.out.println("]");
        int n1=0;
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    n1+=1;
                    break;
                }
            }
        }
        //System.out.printf("%d",n1);
        int[] arr_re=new int[(n-n1)];
        int ind=0;
        for(i=0;i<n;i++)
        {
            boolean f=false;
            int co=0;
            for(j=0;j<n;j++)
            {
                if(i!=j && arr[i]==arr[j])
                {
                    f = true;
                    break;
                }
                else if(arr[i]==arr[j])
                {
                    co+=1;
                }
            }
            if(!f || co==1)
            {
                arr_re[ind]=arr[i];
                ind+=1;
            }

        }
        System.out.printf("removing duplicates array is %s", Arrays.toString(arr_re));
        sc.close();
    }
}
