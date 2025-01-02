public class MainTest
{
    public static void main(String[] args)
    {
        Employee[] arr = new Employee[3];

        SalariedEmployee s1 = new SalariedEmployee("Halit", "Aslan", "0000", 90.000);
        SalariedEmployee s2 = new SalariedEmployee("abc", "def", "789456123",456);
        SalariedEmployee s3 = new SalariedEmployee("sdfsdfsa", "sfasf", "456", 2);

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
    
        for(Employee a:arr)
            System.out.println(a.toString());
        
        System.out.println("We completed our employees infos");
    
    }
}