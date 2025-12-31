import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;
public class arr_list_add_1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //1
        ArrayList<Integer> arr_list_int=new ArrayList<>();
        arr_list_int.add(12);
        arr_list_int.add(34);
        arr_list_int.add(9);
        System.out.println("array integer:"+arr_list_int);
        //2
        ArrayList<String> arr_list_str=new ArrayList<>();
        arr_list_str.add("thiru");
        arr_list_str.add("neshak");
        arr_list_str.add("j");
        System.out.println("array string:"+arr_list_str);
        ArrayList<Object> arr_list_ob=new ArrayList<>();
        arr_list_ob.add("thiru");
        arr_list_ob.add(7);
        arr_list_ob.add(5.8);
        System.out.println("object array:"+arr_list_ob);
        System.out.println("---------------------------------------------");
        //3
        arr_list_int.add(1,22);
        arr_list_str.add(1,"m");
        arr_list_ob.add(2,33);
        System.out.println("integer array:"+arr_list_int);
        System.out.println("array string:"+arr_list_str);
        System.out.println("object array:"+arr_list_ob);
    }

}
