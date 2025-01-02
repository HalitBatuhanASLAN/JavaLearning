public abstract class Employee
{
    private String name;
    private String lastName;
    private String Ssn;

    public Employee(String n,String ln,String ssn)
    {
        name = n;
        lastName = ln;
        Ssn = ssn;
    }


    public String getName(){return name;}
    public String getLastName(){return lastName;} 
    public String getSsn(){return Ssn;}

    public void setName(String na)
    {name = na;}
    
    public void setLastName(String last)
    {lastName = last;}

    public void setSsn(String ssn)
    {Ssn = ssn;}

    public String toString()
    {return String.format("%s %s with ssn %s\n",getName(),getLastName(),getSsn());}

    public abstract double earniings(); 
}