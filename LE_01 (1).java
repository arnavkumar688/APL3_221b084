public class Lab1
{
        int age;
        String name;
        void setAge(int age){
            this.age=age;
        }
        void setName(String name){
            this.name=name;}
        int getAge(){
                return this.age;
            }
        String getName(){
                return this.name;
            }
        public static void main(String[] args){
         Lab1 m1 = new Lab1();
         m1.setName("Ajay");
         m1.setAge(18);
         System.out.println(m1.getName()+" "+m1.getAge());
    }
}