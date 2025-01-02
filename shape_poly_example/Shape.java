public abstract class Shape
{
    private String color;

    public Shape(final String col){color = col;}
    public void displayColor()
    {
        System.out.println("Its color is " + color);
    }
    abstract public double calculateArea();
    abstract public double calculatePerimeter();
}