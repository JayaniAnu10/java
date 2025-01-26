public class Employee {
    String name; //instance variable
    final String department = "DCS"; // constant variable
    int age;

    public void ageFinder() { // instance variable
        String a = "adult"; //local variable
        String c = "child";
        if (age > 18) {
            System.out.println(a);
        } else {
            System.out.println(c);
        }


    }


    // constructors are defined in the relevent class


    public Employee(int age, String name) {  //parameterized constructor
        this.age = age;  // this keyword is used bcz when we need to config the local and instance variable when it is same name we use this
        this.name = name;
    }

    public Employee() { // default constructor is automatically create if there no parametrized ones. if there are parameterized ones we need to create default one too.
        this.name = "employee";
        this.age = 22;

    }

    public Employee(String name) { // parameterized constructor
        this.name = name;
    }
}

