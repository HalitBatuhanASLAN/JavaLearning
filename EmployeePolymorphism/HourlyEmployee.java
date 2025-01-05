public class HourlyEmployee extends Employee
{
    public HourlyEmployee(final String na,final String la,final String ssn,final double wage,final int hours)
    {
        super(na, la, ssn);
        this.wage = wage;
        this.hours = hours;
    }
    private double wage;
    private int hours;
    @Override
    public double earnings()
    {
        if(hours<= 40)
            return wage*hours;
        return (40*wage)+((hours-40)*(wage*1.5));
    }
}