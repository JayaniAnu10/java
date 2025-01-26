public class Main {
    public static void main(String[] args){
        Employee e1= new Employee();
        Employee e2= new Employee();//object creation

        e1.setId(123);
        e1.setName("jayani");
        System.out.println("Id : "+ e1.getId());
        System.out.println("Name : "+ e1.getName());

    }
}
