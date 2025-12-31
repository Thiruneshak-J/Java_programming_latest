import java.util.Arrays;
import java.util.Scanner;
public class com_two_arr_with_rep
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of 1st array:");
        int n1=sc.nextInt();
        int[] arr1=new int[n1];
        int i,j,k;
        for(i=0;i<n1;i++)
        {
            System.out.print("enter the number:");
            int num=sc.nextInt();
            arr1[i]=num;
        }
        System.out.print("enter the size of second array:");
        int n2=sc.nextInt();
        int[] arr2=new int[n2];
        for(i=0;i<n2;i++)
        {
            System.out.print("enter the number of second array:");
            int num= sc.nextInt();
            arr2[i]=num;
        }
        System.out.print("array - 1 = [");
        for(i=0;i<n1;i++)
        {
            if(i!=n1-1)
            {
                System.out.printf("%d,",arr1[i]);
            }
            else
            {
                System.out.printf("%d",arr1[i]);
            }
        }
        System.out.println("]");
        System.out.print("array - 2 = [");
        for(i=0;i<n2;i++)
        {
            if(i!=n2-1)
            {
                System.out.printf("%d,",arr2[i]);
            }
            else
            {
                System.out.printf("%d",arr2[i]);
            }
        }
        System.out.println("]");
        int n3=0;
        if(n1==n2)
        {
            for (i = 0; i < n1; i++)
            {
                for (j = 0; j < n2; j++)
                {
                    if (arr1[i] == arr2[j])
                    {
                        n3+=1;
                        break;
                    }
                }
            }
        }
        else if(n1<n2)
        {
            for (i = 0; i < n1; i++)
            {
                for (j = 0; j < n2; j++)
                {
                    if (arr1[i] == arr2[j])
                    {
                        n3+=1;
                        break;
                    }
                }
            }
        }
        else
        {
            for (i = 0; i < n2; i++)
            {
                for (j = 0; j < n1; j++)
                {
                    if (arr2[i] == arr1[j])
                    {
                        n3+=1;
                        break;
                    }
                }
            }
        }

        int[] arr3=new int[n3];
        int ind=0;
        if(n1<n2)
        {
            for (i = 0; i < n1; i++) {
                for (j = 0; j < n2; j++) {
                    if (arr1[i] == arr2[j]) {
                        arr3[ind] = arr1[i];
                        ind += 1;
                        break;
                    }
                }
            }
        }
        else if(n2<n1)
        {
            for (i = 0; i < n2; i++)
            {
                for (j = 0; j < n1; j++)
                {
                    if (arr2[i] == arr1[j])
                    {
                        arr3[ind]=arr2[i];
                        ind+=1;
                        break;
                    }
                }
            }
        }
        else
        {
            for (i = 0; i < n2; i++)
            {
                for (j = 0; j < n1; j++)
                {
                    if (arr2[i] == arr1[j])
                    {
                        arr3[ind]=arr2[i];
                        ind+=1;
                        break;
                    }
                }
            }
        }
        System.out.printf("common numbers in array is %s%n", Arrays.toString(arr3));

    }
}
