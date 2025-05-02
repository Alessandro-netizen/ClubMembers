import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    public ClubMembers() {
        memberList = new ArrayList<>();
    }

    /**
     * Adds new club members to memberList, as described in part (a).
     * Precondition: names is a non-empty array.
     */
    public void addMembers(String[] names, int gradYear) {
        for (String name : names) {
            memberList.add(new MemberInfo(name, gradYear, true)); // Assuming new members start in good standing
        }
    }

    /**
     * Removes members who have graduated and returns a list of members who have
     * graduated
     * and are in good standing, as described in part (b).
     */
    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> graduatedGoodStanding = new ArrayList<>();

        for (int i = 0; i < memberList.size(); i++) {
            MemberInfo member = memberList.get(i);
            if (member.getGradYear() <= year) {
                if (member.inGoodStanding()) {
                    graduatedGoodStanding.add(member);
                }
                memberList.remove(i);
                i--; // Decrement the index after removing an element
            }
        }
        return graduatedGoodStanding;
    }

    /**
     * Returns the list of all club members.
     */
    public ArrayList<MemberInfo> getMemberList() {
        return memberList;
    }

    /**
     * Sets the list of all club members.
     */
    public void setMemberList(ArrayList<MemberInfo> members) {
        memberList = members;
    }

    public void printMemberList() {
        System.out.println("\nCurrent Club Members:");
        for (MemberInfo member : memberList) {
            System.out.println(member);
        }
    }
}
