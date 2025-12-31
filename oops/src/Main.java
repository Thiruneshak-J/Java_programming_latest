//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

interface Animal{
    void eat();
}
interface Dog {

   void eat();
}

class Cat implements Animal,Dog{
   public void eat(){
        System.out.println("esting....");
    }
}
public class Main{
    public static void main(String[] args) {
          Cat c = new Cat();
          c.eat();


    }
}