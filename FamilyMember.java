import java.time.LocalDate;

public class FamilyMember extends Member {

    // constructing the member object in the subclass

    public FamilyMember(String title, String firstName, String lastName, int age, int memberID, String type,
            String duration,
            LocalDate stardate) {
        super(title, firstName, lastName, age, memberID, type, duration, stardate);
        System.out.println("constructing familyMember object");
    }

    @Override
    public double feeCalculation() {
        if (this.getAge() < 12) {
            System.out.println(" Visitor " + getFirstName() + " is under 12 years old get free entrance.");
            return fee = 0.0;
        }

        if (super.getType().equalsIgnoreCase("Family")
                && super.getDuration().equalsIgnoreCase("Monthly")) {
            // Couple member fee logic
            this.fee = 8.0;
            // System.out.println(" fee is " + this.member.fee);
        } else if (super.getType().equalsIgnoreCase("Family")
                && super.getDuration().equalsIgnoreCase("Annually")) {
            this.fee = 25.0;
            // System.out.println(" fee is " + this.member.fee);
        } else {
            this.fee = 0.0;
        }

        return this.fee;
    }

    @Override
    public String toString() {
        return "FamilyMember Title: " + getTitle() + ", first name: " + getFirstName() + ", last name: " + getLastName()
                + ", age: " + getAge() + " memberID=" + getMemberID() + ", type=" + getType() + ", duration="
                + getDuration() + ", stardate=" + getStardate() + " fee= " + fee;
    }

}
