package wk10;

public abstract class Shape {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Shape() {}
    public Shape(String name) {
        setName(name);
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
