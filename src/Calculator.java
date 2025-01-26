public class Calculator {

    public void add(int a,int b){
        System.out.println("Total: "+(a+b));
    }

    public void add(double a,double b){    // the datatype of parameters are different
        System.out.println("Total: "+(a+b));
    }

    public void add(int a,int b,int c){   //different parameters
        System.out.println("Total: "+(a+b+c));
    }

}
