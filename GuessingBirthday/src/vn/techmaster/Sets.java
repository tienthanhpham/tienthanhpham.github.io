package vn.techmaster;

public class Sets {
    private final int END_OF_MONTH = 31;
    private String set ="";
    private byte first_number;

    public byte getFirst_number() {
        return first_number;
    }

    public Sets(byte hop) {
        this.first_number = hop;
        int limit = 0;
        int i = hop;
        int stringCount = 0;
        final byte MAX_STRING_IN_LINE = 4;
        final byte MAX_DAY_IN_MONTH = 31;

        for (i = hop; i <= MAX_DAY_IN_MONTH;) {
            while (limit < hop) {
                set = set + " " + i + " ";
                i++;
                limit++;
                stringCount++;
                if (stringCount == MAX_STRING_IN_LINE) {
                    set = set + "\n";
                    stringCount = 0;
                }
            }
            if (limit == hop) {
                i = i + hop;
                limit = 0;
            }
        }
    }

    public String getSet() {
        return set;
    }




}
