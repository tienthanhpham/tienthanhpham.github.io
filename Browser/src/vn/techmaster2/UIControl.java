package vn.techmaster2;

public class UIControl {
    protected boolean isEnable;

    public void display() {
        System.out.println("Hien thi hinh");
    }

    public UIControl(boolean isEnable) {
        this.isEnable = isEnable;
    }

    public void disable() {
        this.isEnable = false;
    }

    public void enable() {
        this.isEnable = true;
    }

    public boolean isEnable() {
        return isEnable;
    }
}
