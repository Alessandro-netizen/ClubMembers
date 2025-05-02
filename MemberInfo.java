public class MemberInfo {
    private String name;
    private int graduationYear;
    private boolean goodStanding;

    /**
     * Constructs a MemberInfo object for the club member with name name,
     * graduation year gradYear, and standing hasGoodStanding.
     */
    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) {
        this.name = name;
        this.graduationYear = gradYear;
        this.goodStanding = hasGoodStanding;
    }

    /** Returns the graduation year of the club member. */
    public int getGradYear() {
        return graduationYear;
    }

    /** Returns true if the member is in good standing and false otherwise. */
    public boolean inGoodStanding() {
        return goodStanding;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String s = "\nName: " + name + "\n";
        s += "Year: " + graduationYear + "\n";
        return s + "Good Standing: " + goodStanding + "\n";
    }
}
