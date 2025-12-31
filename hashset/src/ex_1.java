import java.util.HashSet;
//window based count distinct elements;
public class ex_1
{
    static void normal_meth(int[] arr,int k)
    {
        int i,j;
        for(i=0;i<=arr.length-k;i++)
        {
            HashSet<Integer>ar=new HashSet<>();
            for(j=i;j<k+i;j++)
            {
                ar.add(arr[j]);
            }
            System.out.print(ar.size()+" ");
        }
    }


    public static void main(String[] args)
    {
        int[] arr={1,2,1,3,4,2,3};
        int k=4;
        normal_meth(arr,k);
    }

}