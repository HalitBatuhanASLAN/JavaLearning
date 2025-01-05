public class EmployeeTest {
    public static void main(String[] args) {
        // Create objects of each employee type
        SalariedEmployee salariedEmployee = new SalariedEmployee(
                "John", "Doe", "111-11-1111", 800.00
        );

        HourlyEmployee hourlyEmployee = new HourlyEmployee(
                "Jane", "Smith", "222-22-2222", 20.00, 45
        );

        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Tom", "Brown", "333-33-3333", 10000.00, 0.06
        );

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
                "Anna", "Taylor", "444-44-4444", 5000.00, 0.04, 300.00
        );

        // Array of Employee objects
        Employee[] employees = new Employee[] {
                salariedEmployee,
                hourlyEmployee,
                commissionEmployee,
                basePlusCommissionEmployee
        };

        // Process each employee
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee); // Calls each object's toString method
            System.out.printf("Earnings: $%,.2f%n%n", currentEmployee.earnings());
        }
    }
}
