public class Rectangle extends Shape
{
    private double edge1,edge2;

    public Rectangle(final String col,final double edge1,double edge2)
    {
        super(col);
        this.edge1 = edge1;
        this.edge2 = edge2;
    }
    public final double calculateArea()
    {
        return (edge1*edge2);
    }

    public final double calculatePerimeter()
    {
        return (2*(edge1+edge2));
    }
    public final void displayDimensions()
    {
        System.out.println("Dimensions are " + edge1 + " and " + edge2);
    }
}