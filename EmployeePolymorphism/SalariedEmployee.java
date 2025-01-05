public class SalariedEmployee extends Employee
{
    public SalariedEmployee(final String na,final String la,final String ssn,final double weekly_salary)
    {
        super(na, la, ssn);
        this.weekly_salary = weekly_salary;
    }
    private double weekly_salary;
    @Override
    public double earnings()
    {
        return weekly_salary;
    }
}