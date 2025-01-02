public class Triangle extends Shape
{
    private double edge1,edge2,edge3;

    public Triangle(final String col,final double edge1,double edge2,double edge3)
    {
        super(col);
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }
    public double calculateArea()
    {
        double s = (edge1 + edge2 + edge3) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - edge1) * (s - edge2) * (s - edge3));
    }

    public double calculatePerimeter()
    {
        return (edge1+edge2+edge3);
    }
    public final void displaySides()
    {
        System.out.println("Sides are " + edge1 + ", " + edge2 + " and " + edge3);
    }
}