package vn.techmaster.clock;

public class CounterTest {
    public static void Test() {
        CascadedCounter sec = new CascadedCounter(59, 60, "second(s)");
        CascadedCounter min = new CascadedCounter(0, 60, "minute(s)");
        CascadedCounter hr = new CascadedCounter(0, 24, "hour(s)");
        sec.connectLeft(min);
        min.connectLeft(hr);
        System.out.println(sec);
        sec.countUp();
        System.out.println(sec);
        min.setValue(59);
        sec.setValue(59);
        System.out.println(sec);
        sec.countUp();
        System.out.println(sec);
        sec.countDown();
        System.out.println(sec);
    }
}
