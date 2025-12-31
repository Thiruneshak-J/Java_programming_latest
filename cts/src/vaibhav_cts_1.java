import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class vaibhav_cts_1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer>ans=new ArrayList<>();
        int pro=0;
        for(int i=0;i<n;i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                //int num_1=arr[i];
                //int num_2=arr[j];
                if (arr[i]+ arr[j]== 18)
                {
                    int f_e=0;
                    int l_e=0;
                    if(arr[i]>arr[j])
                    {
                        f_e=arr[i];
                        l_e=arr[j];
                    }
                    else if (arr[j]>arr[i])
                    {
                        f_e=arr[j];
                        l_e=arr[i];
                    }
                    else
                    {
                        continue;
                    }
                    int i_pro=arr[i]*arr[j];
                    if(i_pro>pro)
                    {
                        pro=i_pro;
                        ans.clear();
                        ans.add(f_e);
                        ans.add(l_e);
                    }
                }
            }
        }
        System.out.println("ans:"+ans);
    }
}
