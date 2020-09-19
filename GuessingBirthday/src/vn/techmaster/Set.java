package vn.techmaster;

public class Set {
    private int i;
    private final byte DAY_IN_MONTH = 31;
    private String set = "";
    private byte count = 0;
    private byte stringCount = 0;
    private byte firstNumber;

    public byte getFirstNumber() {
        return firstNumber;
    }

    public String getSet() {
        return set;
    }

    public Set(byte size) {
        this.firstNumber = size;
        for (i = size; i <= DAY_IN_MONTH;) {
            while (count < size) {
                set = set + " " + i + " ";
                i++;
                count++;
                stringCount++;
                if (stringCount == 4) {
                    set = set + "\n";
                    stringCount = 0;
                }
            }
            if (count == size) {
                i = i + size;
                count = 0;
            }
        }
    }
}
