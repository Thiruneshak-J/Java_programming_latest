public class ex_3
    //subarray sum contains 0;
{
    public static void main(String[] args)
    {
        int[] arr={4,2,-3,1,6};
        int i,j;
        boolean fo=false;
        for(i=0;i<arr.length;i++)
        {
            int in_sum=0;
            for(j=i;j<arr.length;j++)
            {
                in_sum+=arr[j];
                if(in_sum==0)
                {
                    System.out.println("yes");
                    fo=true;
                    break;
                }
            }
            if(fo)
            {
                break;
            }
        }
        if(!fo)
        {
            System.out.println("no");
        }

    }
}
