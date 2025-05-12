//10.11
public class Circle2D {
    private double x, y, radius;

    Circle2D() {
        x = 0;
        y = 0;
        radius = 1;
    }

    Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * StrictMath.PI;
    }

    public double getPerimeter() {
        return 2 * radius * StrictMath.PI;
    }

    public boolean contains(double x, double y) {
        return Math.hypot(this.x - x, this.y - y) < this.radius;
    }

    public boolean contains(Circle2D circle) {
        return Math.hypot(this.x - circle.x, this.y - circle.y) + circle.radius <= this.radius;
    }

    public boolean overlaps(Circle2D circle) {
        double distance = Math.hypot(this.x - circle.x, this.y - circle.y);
        return distance < this.radius + circle.radius && !this.contains(circle);
    }

    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}
