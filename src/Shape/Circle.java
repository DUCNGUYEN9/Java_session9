package Shape;

public class Circle extends Shape{
    public float banKinh;

    public Circle(String color, float banKinh) {
        super(color);
        this.banKinh = banKinh;
    }

    @Override
    public float getArea() {
    return (float) (banKinh*banKinh*Math.PI);
    }

    @Override
    void display() {
        System.out.printf("color: %s _ area: %.2f\n",getColor(),getArea());

    }
}
