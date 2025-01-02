public class SalariedEmployee extends Employee
{
    private double weeklySalary;

    public SalariedEmployee(String Name,String LastName,String SSN,double weekly)
    {
        super(Name,LastName,SSN);
        weeklySalary = weekly;
    }

    public void setWeekly(double weekly)
    {weeklySalary = weekly;}

    public double earniings()
    {return weeklySalary;}
}