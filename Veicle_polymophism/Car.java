public class Car extends Vehicle
{
    private int number_of_doors;
    public Car(final String brand,final String model,final int year,final double price,int number_of_doors)
    {
        super(brand,model,year,price);
        this.number_of_doors = number_of_doors;
    }
    @Override
    public void displayVehicleDetails()
    {
        System.out.println("Cars brand : " + getBrand());
        System.out.println("Cars model : " + getModel());
        System.out.println("Cars year : " + getYear());
        System.out.println("Cars price : " + getPrice());
        System.out.println("Cars has " + number_of_doors + " doors");
    }
}