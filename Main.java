import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ClubMembers c = new ClubMembers();
        MemberInfo[] roster = {
                new MemberInfo("SMITH, JANE", 2019, false),
                new MemberInfo("FOX, STEVE", 2018, true),
                new MemberInfo("XIN, MICHAEL", 2017, false),
                new MemberInfo("GARCIA, MARIA", 2020, true)
        };
        ArrayList<MemberInfo> memberList = new ArrayList<>(Arrays.asList(roster));
        c.setMemberList(memberList);

        System.out.println("Graduated Good Standing:");
        ArrayList<MemberInfo> graduatedGoodStanding = c.removeMembers(2018);
        for (MemberInfo member : graduatedGoodStanding) {
            System.out.println(member);
        }

        System.out.println("\nRemaining Member List:");
        ArrayList<MemberInfo> remainingList = c.getMemberList();
        for (MemberInfo member : remainingList) {
            System.out.println(member);
        }
    }
}
