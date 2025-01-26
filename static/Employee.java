public class Employee {
    String name; //instance variable
    int age;
    static String department ;

   static{
        department="IT"; // only one time this block runs
       System.out.println("in block");

    }


    public Employee(){
        department="CS";  // otherwise we can initialize static like this,the static variable only refers to one variable,depends on the class
        System.out.println("in constructor");
   }

    public void show(){
        System.out.println(age+" "+name+" "+department);
    }
}
