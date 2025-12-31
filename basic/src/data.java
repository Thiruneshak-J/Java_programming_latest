public class data
{
    public static void main(String[] args)
    {
        //integer
        byte a=10;       //range -128 to 127
        short b=12000;   //range -32k to 32k (*)
        int c=10093929;  // range -2c to 2c  (*)
        long d=1234567897; //
        System.out.printf("integer byte a= %d%n",a);
        System.out.printf("integer short b= %d%n",b);
        System.out.printf("integer int c= %d%n",c);
        System.out.printf("integer long d=%d%n",d);

        //decimal
        float e=2.32541f;     //range .6f
        double f=23.339929;   //range .12f or extra
        System.out.printf("decimal float e=%.2f%n",e);
        System.out.printf("decimal float d=%.6f%n",f);

        //character
        char g='y';
        System.out.printf("character g=%c%n",g);
        //boolean
        boolean h=true;   //true or false
        System.out.printf("boolean h=%b%n",h);
        //string
        String t="thiru";
        System.out.printf("string t=%s",t);
    }
}

