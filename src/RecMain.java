public class RecMain {
    public static void main(String[] args){
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(5,8);
        System.out.println("REC 1: Area :"+r1.getArea()+" "+"Perimeter :"+ r1.getPerimeter());
        System.out.println("count : "+ Rectangle.count);
        System.out.println("REC 2: Area :"+r2.getArea()+" "+"Perimeter :"+ r2.getPerimeter());
        System.out.println("count : "+ Rectangle.count);
    }
}
