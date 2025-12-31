import java.util.Scanner;
public class ex_10_vowel
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the character:");
        char ch=sc.next().charAt(0);
        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.printf("the character %c is vowel",ch);
        }
        else
        {
            System.out.printf("the character %c is consonant",ch);
        }
    }
}
