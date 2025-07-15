package wk10;

public abstract class SidedShape extends Shape {

    private double sides;


    public void setSides(double sides) {
        this.sides = sides;
    }

    public double getSides() {
        return sides;
    }

    public SidedShape() {}
    public SidedShape(String name, double sides) {
        super(name);
        setSides(sides);
    }
}
