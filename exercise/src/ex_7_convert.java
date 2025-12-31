public class ex_7_convert
{
    public static void main(String[] args)
    {
        int num=15;
        double d=(double)num;
        System.out.println(num); // 25.0
        System.out.println(((Object)num).getClass().getSimpleName());
    }
}
