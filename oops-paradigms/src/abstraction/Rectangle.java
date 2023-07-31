package abstraction;

public class Rectangle implements Shape{

    float lenght;
    float breadth;

    public Rectangle(float lenght, float breadth) {
        this.lenght = lenght;
        this.breadth = breadth;
    }

    @Override
    public void draw() {
        System.out.println("I'm drawing Rectangle.");
    }

    @Override
    public double calculation() {
        return lenght*breadth;
    }
}
