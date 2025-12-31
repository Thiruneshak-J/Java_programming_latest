
import java.util.*;
public class ex_5_rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(33);
        list.add(54);
        list.add(66);
        list.add(70);
        list.add(89);
        System.out.println(list);
        int i=0, j=list.size()-1;
        while (i <j)
        {
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
                i++;
                j--;
        }
        System.out.println("rev list:" + list);
    }
}
