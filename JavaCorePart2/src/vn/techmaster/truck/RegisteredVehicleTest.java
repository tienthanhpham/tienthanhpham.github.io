package vn.techmaster.truck;

public class RegisteredVehicleTest {
    public static void implement() throws RegistrationException {
        RegisteredVehicle[] vehicles =
                { new Truck("01", "Thanh", "Techmaster",
                        1000, 10, "BANTAI"),
                  new Truck("02", "Phuc", "Techmaster",
                        2000, 100, "CAMNHONG"),
                  new Truck("03", "Tung", "Techmaster",
                        4000, 500, "XETAI"),
                };
        try {
            vehicles[0].reRegister("Cuong", "FPT", 1);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        for (RegisteredVehicle vehicle : vehicles) {
            vehicle.printRegistration();
            System.out.println(vehicle.getAnnualFee(vehicle.getTruckType()));
        }
    }
}
