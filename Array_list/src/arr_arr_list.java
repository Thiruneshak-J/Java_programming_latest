import java.util.ArrayList;
import java.util.Arrays;

public class arr_arr_list
{
    public static void main(String[] args)
    {
        System.out.println("array to ArrayList:");
        int[] arr={1,2,3,4,5};
        ArrayList<Integer> arr_list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            arr_list.add(arr[i]);
        }
        System.out.println("array to ArrayList is :" + arr_list);
        ArrayList<Integer> list= new ArrayList<>();
        list.add(23);
        list.add(0,22);
        list.add(23);
        list.add(45);
        System.out.println("array list is "+list);
        Integer[] arr1=list.toArray(new Integer[0]);
        System.out.print("arrayLIst to array [");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.printf("%d,",arr1[i]);
        }
        System.out.println("]");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
