import java.util.Scanner;
import java.util.Arrays;
public class non_rep_1st
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter the size of array:");
        n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            System.out.print("enter the number:");
            int num = sc.nextInt();
            arr[i] = num;
        }
        System.out.print("you entered array is [");
        for (i = 0; i < n; i++) {
            if (i != n - 1) {
                System.out.printf("%d,", arr[i]);
            } else {
                System.out.printf("%d", arr[i]);
            }
        }
        System.out.print("]\n");
        int j,co=0;
        boolean f=false;
        for(i=0;i<n;i++)
        {
            boolean rep=false;
            for(j=0;j<n;j++)
            {
                if(i!=j && arr[i]==arr[j])
                {
                    rep=true;
                    continue;
                }
            }
            if(!rep)
            {
                f=true;
                co++;
                continue;
            }
        }
        int[] arr_1=new int[co];
        int ind=0;
        boolean f1=false;
        for(i=0;i<n;i++)
        {
            boolean rep=false;
            for(j=0;j<n;j++)
            {
                if(i!=j && arr[i]==arr[j])
                {
                    rep=true;
                    continue;
                }
            }
            if(!rep)
            {
                f1=true;
                arr_1[ind]=arr[i];
                ind++;
                continue;
            }
        }
        if(!f1)
        {
            System.out.println("no non-repeating element");
        }
        else
            {
                System.out.printf("%d",arr_1[1]);
            }
    }
}