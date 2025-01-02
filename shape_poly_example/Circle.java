public class Circle extends Shape
{
    final Double PI = 3.14;
    private double radius;

    public Circle(final String col,final double rad)
    {
        super(col);
        radius = rad;
    }
    public final double calculateArea()
    {
        return (PI*radius*radius);
    }

    public final double calculatePerimeter()
    {
        return (2*PI*radius);
    }

    public final void displayRadius()
    {
        System.out.println("Radius is " + radius);
    }
}