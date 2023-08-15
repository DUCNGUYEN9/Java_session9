package Shape;

public class Main {
    public static void main(String[] args) {
        System.out.println("Circle");
        Shape circle= new Circle("red",4.5f);
        circle.getArea();
        circle.display();
        System.out.println("Rectangle");
        Shape rectangle=new Rectangle("Green",4,8);
        rectangle.getArea();
        rectangle.display();
    }
}
