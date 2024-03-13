
// // importing packages
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Museum {
    public String NAME;
    public String LOCATION;
    public DateTimeFormatter visitDateTime = DateTimeFormatter.ofPattern("E, mm");
    // Map for fee structure
    public ArrayList<Double> entryFeeTable;
    public static ArrayList<Member> memberList = new ArrayList<>();

    public void addMember(Member member) {
        memberList.add(member);
    }
}