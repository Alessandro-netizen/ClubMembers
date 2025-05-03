import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    public ClubMembers() {
        memberList = new ArrayList<>();
    }


    public void addMembers(String[] names, int gradYear) {
        for (String name : names) {
            memberList.add(new MemberInfo(name, gradYear, true)); 
        }
    }


    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> graduatedGoodStanding = new ArrayList<>();

        for (int i = 0; i < memberList.size(); i++) {
            MemberInfo member = memberList.get(i);
            if (member.getGradYear() <= year) {
                if (member.inGoodStanding()) {
                    graduatedGoodStanding.add(member);
                }
                memberList.remove(i);
                i--; 
            }
        }
        return graduatedGoodStanding;
    }


    public ArrayList<MemberInfo> getMemberList() {
        return memberList;
    }

   
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
