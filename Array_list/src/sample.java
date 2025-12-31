import java.util.ArrayList;
import java.util.Objects;

public class sample
{
    public static void main(String[] args)
    {
        //ArrayList<Integer>
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(0);
        arr.add(3);
        arr.add(5);
        System.out.println("interger array is"+arr);
        //ArrayList<String>
        ArrayList<String> arr1=new ArrayList<>();
        arr1.add("thiruneshak");
        arr1.add("jayakumar");
        arr1.add("saritha");
        System.out.println("string array is"+arr1);
        //ArrayList<double>
        ArrayList<Double> arr2=new ArrayList<>();
        arr2.add(2.3);
        arr2.add(5.6);
        arr2.add(8.5);
        System.out.println("double Array is "+arr2);
        //ArrayList<Object<
        ArrayList<Object> arr3=new ArrayList<>();
        arr3.add("thiruneshak");
        arr3.add("3");
        arr3.add("8.7");
        System.out.println("object array is "+arr3);


    }
}