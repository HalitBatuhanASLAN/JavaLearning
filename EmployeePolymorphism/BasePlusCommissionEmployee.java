public class BasePlusCommissionEmployee extends CommissionEmployee
{
    public BasePlusCommissionEmployee(final String na,final String la,final String ssn,final double groosSales,final double commisionRate,final double baseSalary)
    {
        super(na, la, ssn,groosSales,commisionRate);
        this.baseSalary = baseSalary;
    }
    private double groosSales;
    private double commisionRate;
    private double baseSalary;
    @Override
    public double earnings()
    {
        return (commisionRate*groosSales)+baseSalary;
    }
}