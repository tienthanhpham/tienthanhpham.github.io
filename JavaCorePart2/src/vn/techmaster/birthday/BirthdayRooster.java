package vn.techmaster.birthday;

public class BirthdayRooster {
    private static String[] day = {"Saturday", "Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday"};
    
    private static Employee[] emp = { new Employee("Chu Chi Cuong",
            new Date(26,9,2020), "IT"),
            new Employee("Nguyen Xuan Phuc",
                    new Date(26,1,2020), "HR"),
            new Employee("Le Manh Ha",
                    new Date(26,12,2020), "AC")
    };

    public static void print() {
        for(Employee e: emp)
            System.out.println(e + " (" + day[e.getBirthday().dayOfWeek()] +")");
    }
}
