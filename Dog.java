public class Dog implements Animal {
    @Override
    public void sleep() {
        System.out.println("Dog sleep");
    }

    @Override
    public void eat() {
        System.out.println("dog eats");
    }// instead of extends we use implements for inheritence

}
