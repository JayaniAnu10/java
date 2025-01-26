public class Employee {

    // encapsulation = make sure that sensitive data is hidden from users.
    // to access private variables we can use getter and setter.


    private String name;
    private int id;


    //getter to get a data -> return
    //setter to set the data -> parameter

    public void setId(int id){  // id setter
        this.id=id;
    }

    public int getId(){  // id getter
        return id;
    }


    // alt+shift+insert

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}