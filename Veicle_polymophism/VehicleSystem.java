public class VehicleSystem {
    public static void main(String[] args) {
        // Polymorphism: Using Vehicle references to store Car and Truck objects
        Vehicle car = new Car("Toyota", "Camry", 2020, 25000, 4);
        Vehicle truck = new Truck("Ford", "F-150", 2019, 40000, 2.5);

        // Display details of each vehicle
        car.displayVehicleDetails();
        try
        {
            double depreciation = car.calculateDepreciation(2025);
            System.out.println("Depreciated Value (2025): $" + car.calculateDepreciation(2025));
        }
        catch(InvalidCarAgeException e)
        {
            System.out.println("Deplication error : " + e.getMessage());
        }
        System.out.println();

        truck.displayVehicleDetails();
        try
        {
            double depreciation = truck.calculateDepreciation(2025);
            System.out.println("Depreciated Value (2025): $" + truck.calculateDepreciation(2025));
        }
        catch(InvalidCarAgeException e)
        {
            System.out.println("Deplication error : " + e.getMessage());
        }
        System.out.println();

        // Demonstrating polymorphism with an array of Vehicle objects
        Vehicle[] vehicles = {
            new Car("Honda", "Civic", 2018, 20000, 4),
            new Truck("Chevrolet", "Silverado", 2021, 45000, 3.0),
            new Car("Tesla", "Model 3", 2022, 45000, 4)
        };

        System.out.println("Displaying details of all vehicles:");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayVehicleDetails();
            try
            {
                double depreciation = vehicle.calculateDepreciation(2025);
                System.out.println("Depreciated Value (2025): $" + vehicle.calculateDepreciation(2025));
            }
            catch(InvalidCarAgeException e)
            {
                System.out.println("Deplication error : " + e.getMessage());
            }
            System.out.println();
        }
    }
}
