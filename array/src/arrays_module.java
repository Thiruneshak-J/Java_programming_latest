import java.util.Arrays;
public class arrays_module
{
    public static void main(String[] args)
    {
        int[] a = {50, 20, 40, 10};
        Arrays.sort(a);                          //[10,20,40,50]
        System.out.println(Arrays.toString(a));  //change in to string and print in single line
        int index=Arrays.binarySearch(a,20);
        System.out.printf("the index of 20 is %d%n",index);
        int[] b=Arrays.copyOf(a,6);
        System.out.println(Arrays.toString(b));
        Arrays.fill(b,4,6,100);
        System.out.println(Arrays.toString(b));
        String[] names={"thiru","want","to","get","job"};
        Arrays.sort(names,String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(names));
        int[] cop=b.clone();
        System.out.println(Arrays.toString(cop));
        int[] cop1=Arrays.copyOf(b,b.length-1);
        System.out.println(Arrays.toString(cop1));
        int[] cop2=Arrays.copyOfRange(b,3,6);
        System.out.println(Arrays.toString(cop2));
    }
}
//Arrays.sort(a)
//System.out.print(Arrays.toString(a))
//Arrays.binarysearch(b,value(40));
//Arrays.fill(b,4,6,100);

//Arrays.copyOf(a,6);(variable,length)
//Arrays.copyOfRange(b,4,6)
//b=a.clone();
