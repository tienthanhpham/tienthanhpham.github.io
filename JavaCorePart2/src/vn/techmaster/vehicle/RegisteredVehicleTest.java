package vn.techmaster.vehicle;

public class RegisteredVehicleTest {
    public static void run() {
        RegisteredVehicle[] vehicles = {
                new Truck("01", "Phuc", "FPT",
                        1000, 10, "BANTAI"),
                new Truck("01", "Cuong", "Apple",
                        2000, 20, "CAMNHONG"),
                new Truck("01", "Quan", "Samsung",
                        3000, 30, "CONTAINER")
        };

        try {
            vehicles[0].reRegister("Nam", "FPT", 5);
        } catch (RegistrationException ex) {
            System.out.println(ex);
        }

        for (RegisteredVehicle vehicle: vehicles)
            System.out.println(vehicle.printRegistration());
    }
}
