package sample;
import java.util.Arrays;
public class sum_arr
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        int temp=0;
        for(int i =0;i<arr.length;i++)
        {
            temp+=arr[i];
        }
        System.out.printf("%d",temp);
    }
}
