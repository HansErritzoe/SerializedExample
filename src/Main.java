import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of Member objects
        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member("Alice", 30));
        members.add(new CompetitionMember("Bob", 25, "Swimming"));
        members.add(new Member("Charlie", 35));

        // File path for storing member objects
        String filePath = "members.dat";

        // Write members to file
        MemberRepository.writeMembers(members, filePath);

        // Read members from file
        ArrayList<Member> readMembers = MemberRepository.readMembers(filePath);

        // Print the read members
        for (Member member : readMembers) {
            System.out.println(member);
        }
    }
}
