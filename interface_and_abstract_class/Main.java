
abstract class Vehicle
{
    public Vehicle(final String bra,final int spe)
    {
        brand = bra;
        speed = spe;
    }
    protected String brand;
    protected int speed;

    abstract public void start();
    public void stop()
    {System.out.println("Car stopped");}
}

interface Electric
{
    public void chargeBattery();
    public int getBatteryLevel();
}

class ElectricCar extends Vehicle implements Electric
{
    ElectricCar(final String bra,final int spe,final int batter)
    {
        super(bra,spe);
        batteryLevel = batter;
    }
    private int batteryLevel;
    public void start()
    {
        System.out.println("Electric car " + brand + " started");
    }
    public void chargeBattery(){System.out.println("Electric car batter type");}
    public int getBatteryLevel(){return batteryLevel;}
}

class ElectricScooter extends Vehicle implements Electric
{
    ElectricScooter(final String bra,final int spe,final int batter)
    {
        super(bra,spe);
        batteryLevel = batter;
    }
    private int batteryLevel;
    public void start()
    {
        System.out.println("Electric scooter " + brand + " started");
    }
    public void chargeBattery(){System.out.println("Electric scoortor batter type");}
    public int getBatteryLevel(){return batteryLevel;}
}
public class Main
{
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar("Tesla", 200, 50);
        ElectricScooter scooter = new ElectricScooter("Xiaomi", 25, 30);

        // Start the vehicles
        car.start();
        scooter.start();

        // Charge the vehicles
        car.chargeBattery();
        scooter.chargeBattery();

        // Display battery levels
        System.out.println("Car Battery Level: " + car.getBatteryLevel() + "%");
        System.out.println("Scooter Battery Level: " + scooter.getBatteryLevel() + "%");

        // Stop the vehicles
        car.stop();
        scooter.stop();
    }
}