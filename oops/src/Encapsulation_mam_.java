public class Encapsulation_mam_
{

        private int id;
        private int age;
        private String name;

        public int getId () {
            return id;
        }

        public void setId ( int id){
            this.id = id;
        }

        public int getAge () {
            return age;
        }

        public void setAge ( int age){
            this.age = age;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }
        public static void main(String[] args)
        {
            Encapsulation_mam_ emp=new Encapsulation_mam_();
            emp.setId(108);
            emp.setAge(22);
            emp.setName("thiru");
            System.out.println("name is :"+emp.getName());
            System.out.println("age is :"+emp.getAge());
            System.out.println("id is :"+emp.getId());
        }


}
