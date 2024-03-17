import java.time.LocalDate;
import java.time.LocalDateTime;

public class Member {

    // Member Visitor composition relation by calling the Visitor object:
    private Visitor visitor;
    // Variables declaration using encapsulation
    private int membershipID;
    // adding a static counter
    private static int nextID = 1; // initialize with 1
    private String durationMonth;
    private LocalDate membershipStartingDate;
    private MembershipType membershipType;

    // Concrete method to construct object "Member"
    public Member(String title, String firstName, String lastName, int age, LocalDateTime visitDateTime,
            String durationMonth, LocalDate membershipStartingDate, MembershipType membershipType) {
        this.visitor = new Visitor(title, firstName, lastName, age, visitDateTime);
        this.membershipID = nextID++;
        this.durationMonth = durationMonth;
        this.membershipStartingDate = membershipStartingDate;
        this.membershipType = membershipType;
    }

    public Member(String title, String firstName, String lastName, int age, LocalDateTime visitDateTime) {
        this.visitor = new Visitor(title, firstName, lastName, age, visitDateTime);
        this.membershipID = nextID++;
        this.durationMonth = null;
        this.membershipStartingDate = null;
        this.membershipType = null;
    }

    // Getters to access the private attribute from external classes:
    public Visitor geVisitor() {
        return visitor;
    }

    public int getMembershipID() {
        return membershipID;
    }

    public String getDurationMonth() {
        return durationMonth;
    }

    public LocalDate getMembershipStartingDate() {
        return membershipStartingDate;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    // // Method to set MembershipType from enum class
    // public void setMemberShipType(MembershipType membershipType)
    // {this.membershipType = membershipType;}

    // toString method implementation to print member from memberlist

    @Override
    public String toString() {
        return "Visitor: " + visitor + ", Membership Type: " + getMembershipType() + ", Member ID: "
                + getMembershipID() +
                ", Period: " + getDurationMonth() +
                ", Start Date: " + getMembershipStartingDate();
    }

}
