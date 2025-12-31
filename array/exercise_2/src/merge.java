import java.util.Arrays;
public class merge
{
    public static void main(String[] args)
    {
        int[] arr={1,3,5};
        int[] arr1={2,4,6};
        int[] mer=new int[arr.length+arr1.length];
        int i;
        for(i=0;i<arr.length;i++)
        {
            mer[i]=arr[i];
        }
        for(i=0;i< arr1.length;i++)
        {
            mer[arr.length+i]=arr1[i];
        }
        System.out.print(Arrays.toString(mer));
    }

}