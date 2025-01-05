public class CommissionEmployee extends Employee
{
    public CommissionEmployee(final String na,final String la,final String ssn,final double groosSales,final double commisionRate)
    {
        super(na, la, ssn);
        this.groosSales = groosSales;
        this.commisionRate = commisionRate;
    }
    private double groosSales;
    private double commisionRate;
    @Override
    public double earnings()
    {
        return commisionRate*groosSales;
    }
}