public class EmpMain {
    public static void main(String[] args){
        Employee e1= new Employee(); //object creation
        System.out.println(e1.age+" "+e1.name); // default one is called

        Employee e2= new Employee(12,"adithya");
        System.out.println(e2.age+" "+e2.name);


        Employee e3= new Employee("adithya");
        System.out.println(e3.name);

       /* e1.age=15;
        e1.name="Jayani";
        e1.ageFinder();*/
    }
}
