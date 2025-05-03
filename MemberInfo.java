public class MemberInfo {
    private String name;
    private int graduationYear;
    private boolean goodStanding;

    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) {
        this.name = name;
        this.graduationYear = gradYear;
        this.goodStanding = hasGoodStanding;
    }

    public int getGradYear() {
        return graduationYear;
    }
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
