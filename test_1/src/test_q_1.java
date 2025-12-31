import java.util.Arrays;
public class test_q_1
{
    public static void main(String[] args)
    {
        int[] nums={2,7,11,15};
        int i,j;
        int sum=9;
        int[] ans=new int[2];
        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==sum)
                {
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        System.out.print(Arrays.toString(ans));
    }

}
