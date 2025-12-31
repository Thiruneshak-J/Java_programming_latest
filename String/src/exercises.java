import java.lang.String;
public class exercises
{
    public static void main(String[] args)
    {
        //7
        String Str1="PHP Exercises and";
        String Str2= new String(" Python Exercises");
        String Strcon=(Str1+Str2);
        System.out.println("7 :concatenate String :"+Strcon);
        //8
        String con="PHP Exercises and Python Exercises";
        System.out.println("8: and is present in string:"+con.contains("and"));
        //9
        String com1="Example.com";
        String com2="example.com";
        System.out.println("9 :compares Exam to exam:"+com1.equals(com2));
        com2="Example.com";
        System.out.println("9 :compares Exam to Exam:"+com1.equals(com2));
        //10
        StringBuffer comp=new StringBuffer("example.com");
        StringBuffer comp1=new StringBuffer("example.com");
        System.out.println("(s.buf)Comparing example.com and example.com:"+comp.equals(comp1));
        //11
        String ob="The book contains 234 pages.";
        ob.toCharArray();
        System.out.println("11.string ob to string array:"+ob);
        //12***************************************************
        String end="Python exercises";
        System.out.println("12.is ends with se:"+end.endsWith("se"));
        end=new String("Python Exercise");
        System.out.println("12.is end with se:"+end.endsWith("se"));
        //13
        String eq="Stephen Edwin King";
        String eq1="Walter Winchell";
        System.out.println("13 :\""+eq+"\"equals\""+eq1+"\":"+eq.equals(eq1));
        eq1="Mike Royko";
        System.out.println("13:comparing both :"+eq.equals(eq1));
        eq1="stephen edwin king";

        //14
        System.out.println("14.comparing without case:"+eq.equalsIgnoreCase(eq1));
        eq1="Mike Royko";
        System.out.println("14.\""+eq +"\" equals \""+eq1+ "\""+"? "+eq.equalsIgnoreCase(eq1));


    }
}
