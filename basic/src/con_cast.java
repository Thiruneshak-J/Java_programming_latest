
public class con_cast
{
    public static void main(String[] args)
    {
        //type converson(implicit/widening) small->large , manually , no dataloss
        int a=10;
        long d =a;
        System.out.println(d);

        //type casting(explicit/narrowing) large -> small,auto,dataloss
        int c=10;
        short b =(short)c;
        System.out.println(b);
    }
}
