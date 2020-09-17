package vn.techmaster2;

public class UIControl {
    protected boolean isEnable;

    public void enable() {
        this.isEnable = true;
    }

    protected void disable() {
        this.isEnable = false;
    }

    public boolean isEnable() {
        return isEnable;
    }
}
