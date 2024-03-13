import java.time.LocalDate;
import java.time.LocalDateTime;

public class Member extends Person {

    // Variables declaration using encapsulation
    private int membershipID;
    // adding a static counter
    private static int nextID = 1; // initialize with 1
    private String durationMonth;
    private LocalDate membershipStartingDate;
    private MembershipType membershipType;

    // Concrete method to construct object "Member"
    public Member(String title, String firstName, String lastName, int age, LocalDateTime visitDateTime,
            MembershipType membershipType, String durationMonth, LocalDate membershipStartingDate) {
        super(title, firstName, lastName, age, visitDateTime);
        this.membershipID = nextID++;
        this.durationMonth = durationMonth;
        this.membershipStartingDate = membershipStartingDate;
        this.membershipType = membershipType;
    }

    // Getters to access the private attribute from external classes:
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

    // Method to set MembershipType from enum class
    public void setMemberShipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

    // toString method implementation to print member from memberlist

    @Override
    public String toString() {
        return "Title: " + getTitle() + ", First Name: " + getFirstName() + ", Last Name: " + getLastName() +
                ", Age: " + getAge() + ", Visit Date and Time: " + ", Membership Type: " + ", Member ID: "
                + getMembershipID() +
                ", Period: " + getDurationMonth() +
                ", Start Date: " + getMembershipStartingDate();
    }

    // // concrete FeeCalculation method using enum Membership Type as parameter
    // public void individualFeeCalculation() {
    // System.out.println("individual membership calc");
    // }

    // public void coupleFeeCalculation() {
    // System.out.println("couple membership calc");
    // }

    // public void familyFeeCalculation() {
    // System.out.println("family membership calc");
    // }

}
