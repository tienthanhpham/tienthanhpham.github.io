package vn.techmaster.dayofweek;

public class BirthdayRooster {

    public static void print() {
        String[] day = {"Saturday", "Sunday", "Monday",
                "Tuesday", "Wednesday", "Thursday", "Friday"};
        Employee[] emp = {new Employee("Nguyen Xuan Phuc",
                new Date(15, 11, 1979),
                "IT"),
                new Employee("Le Manh Ha",
                        new Date(2, 1, 1981),
                        "IT"),
                new Employee("Chu Chi Cuong",
                        new Date(15, 3, 2000),
                        "IT")};
        for (Employee e: emp)
            System.out.println(e + " (" + day[e.getBirthday().dayOfWeek()] + ")");
    }

}
