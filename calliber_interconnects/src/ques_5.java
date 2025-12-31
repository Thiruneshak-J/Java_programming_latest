import java.util.ArrayList;
public class ques_5
{
    public static void main(String[] args)
    {
        int[] arr={5,1,3,7,2,5};
        int sum=10;
        int i,j;
        for(i=0;i<arr.length-1;i++)
        {
            ArrayList<Integer>p_arr=new ArrayList<>();
            int sum_p=0;
            for(j=i;j<arr.length;j++)
            {
                sum_p+=arr[j];
            }
        }
    }

}
