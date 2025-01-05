public abstract class Employee
{
    public Employee(final String na,final String la,final String ssn)
    {
        name = na;
        lastName = la;
        SSN = ssn;
    }
    protected String name;
    protected String lastName;
    protected String SSN;

    public void setFirst(final String na){name = na;}
    public void setLast(final String la){lastName = la;}
    public void setSSN(final String ssn){SSN = ssn;}

    public String getFirst(){return name;}
    public String getLast(){return lastName;}
    public String getSSN(){return SSN;}
    public abstract double earnings();
}