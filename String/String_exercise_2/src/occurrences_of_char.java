import java.util.Scanner;
public class occurrences_of_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the String:");
        String str = new String(sc.nextLine());
        char[] str_arr = str.toCharArray();
        int len = 0;
        for (char i : str_arr) {
            len++;
        }
        boolean[] count=new boolean[len];
        //System.out.printf("%d",len);
        int i, j;
        for (i = 0; i < len; i++)
        {
            if(count[i])
            {
                continue;
            }
            int co = 0;
            for (j = 0; j < len; j++)
            {
                if (str.charAt(i) == str.charAt(j))
                {
                    co += 1;
                    count[j]=true;
                }
            }
            System.out.printf("character %c - %d times in string.\n", str.charAt(i), co);
        }
    }
}
