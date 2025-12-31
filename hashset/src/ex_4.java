public class ex_4
    //is k is in sum of array
{
    public static void main(String[] args)
    {
        int[] arr={10,15,3,7};
        int k=17;
        boolean fo=false;
        for(int i =0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==k)
                {
                    System.out.print("yes");
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
