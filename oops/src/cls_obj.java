public class cls_obj
{
    String name;
    int age;
    cls_obj(String name, int age){
        this.age = age;
        this.name = name;
    }
    void det()
    {
        System.out.printf("hiii,my name is %s,my age %d%n",name,age);
    }
    public static void main(String[] args)
    {
        cls_obj p=new cls_obj("thiru", 22);

        System.out.println(p.age+" "+p.name);
        p.age=21;
        p.det();
    }
}