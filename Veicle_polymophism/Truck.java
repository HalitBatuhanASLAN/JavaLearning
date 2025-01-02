public class Truck extends Vehicle
{
    private double payLoadCapacity;
    public Truck(final String brand,final String model,final int year,final double price,final double payLoadCapacity)
    {
        super(brand,model,year,price);
        this.payLoadCapacity = payLoadCapacity;
    }
    @Override
    public void displayVehicleDetails()
    {
        System.out.println("Cars brand : " + getBrand());
        System.out.println("Cars model : " + getModel());
        System.out.println("Cars year : " + getYear());
        System.out.println("Cars price : " + getPrice());
        System.out.println("Cars has " + payLoadCapacity );
    }


}