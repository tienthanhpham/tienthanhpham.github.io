package vn.techmaster.highway;

public interface Payable {
    void setValid(boolean valid);
    void adjustValue(int amount);
    boolean isValid();
    void deduct(int amount);
    void setOrigin(Gate origin);
    Gate getOrigin();
    int getValue();
}
