public class stack_usage
{
    static void d()
        {
            float dob=12.4f;
            System.out.printf("double = %.1f,method d is executed%n",dob);
        }
        static void c()
        {
            int ca=34;
            System.out.printf("integer c=%d,method c is executed%n",ca);
        }
        void b()
        {
            String str="thiru";
            c();
            System.out.printf("String b =%s,method b is executed%n",str);
        }
        void a()
        {
            int num=45;
            b();
            System.out.printf("number num=%d,method a is executed\n",num);
        }
        public static void main(String[] args)
        {
            stack_usage p=new stack_usage();
            p.a();
            d();
        }


}
