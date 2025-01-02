class InvalidCarAgeException extends Exception
{
    public InvalidCarAgeException(String message)
    {
        super(message);
    }
}

abstract class Vehicle
{
    private String brand;
    private String model;
    private int year;
    private double price;

    public Vehicle(final String brand,final String model,final int year,final double price)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public abstract void displayVehicleDetails();
    public double calculateDepreciation(final int currentYear)throws InvalidCarAgeException
    {
        final int age = currentYear - this.year;
        if(age<0)
            throw new InvalidCarAgeException("Car age can not be less than 0\n");
        return price - (age * 0.1 * price);
    }

    public String getBrand(){return this.brand;}
    public String getModel(){return this.model;}

    public int getYear(){return this.year;}
    public double getPrice(){return this.price;}
}