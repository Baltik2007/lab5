//Oleksandra Chebotar
//C00325201
//20/10/2026
//Lab5 OOSD

public class Circle extends Point {
    private int radius;

    public Circle() {
        super();
        this.radius = 0;
    }

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[x=" + x + ", y=" + y + ", radius=" + radius + "]";
    }
}
