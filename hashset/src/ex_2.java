import java.util.Arrays;
import java.util.Set;
import java.util.ArrayList;

public class ex_2
{
    int meth(int[] arr)
    {
        Arrays.sort(arr);
        int i,j;
        int count=0;
        for(i=0;i<arr.length;i++)
        {
            int inner_co=1;
            for(j=i;j< arr.length-1;j++)
            {
                if(arr[j+1]==arr[j])
                {
                    continue;
                }
                else if(arr[j+1]==arr[j]+1)
                {
                    inner_co+=1;
                }
                else
                {
                    break;
                }
            }
            if(count<inner_co)
            {
                count=inner_co;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[] arr={100,4,200,1,3,2};
        ex_2 ob=new ex_2();
        int ans=ob.meth(arr);
        System.out.println("answer:"+ans);
    }

}
