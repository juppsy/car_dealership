public class Dealership {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Tom", "123 Anything St.", 12000);
        Customer customer2 = new Customer("Joe", "123 Other St.", 5000);
        Customer customer3 = new Customer("Alex", "Oo Street", 3000);

        Employee employee1 = new Employee();

        Vehicle vehicle1 = new Vehicle("Tesla", "Model S", 2018, "white", 40000);
        Vehicle vehicle2 = new Vehicle("Dacia", "Logan", 2017, "red", 3000);
        Vehicle vehicle3 = new Vehicle("BMW", "M3", 2010, "black", 5000);


        customer1.purchaseCar(vehicle1, employee1, true);
        customer2.purchaseCar(vehicle2, employee1, false);
        customer3.purchaseCar(vehicle3, employee1, false);

    }
}
