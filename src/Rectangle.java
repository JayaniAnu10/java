public class Rectangle {
    double length;
    double width;
    static int count=0; // not an instance variable .it is a static variable(class variable - depends on the class not each an on object)

    public Rectangle(){
        length=5;
        width=2;
        count++;
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        count++;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length+width);
    }
}
