package Shape;

public class Rectangle extends Shape{
    private float height;
    private float width;

    public Rectangle(String color, float height, float width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public float getArea() {
        return height*width;
    }

    @Override
    void display() {
        System.out.printf("color: %s _ area: %.2f\n",getColor(),getArea());

    }
}
