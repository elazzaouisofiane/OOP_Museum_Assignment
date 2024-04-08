import java.time.LocalDate;

public class FamilyMember extends Member {

    // constructing the FamilyMember object in the subclass

    public FamilyMember(String title, String firstName, String lastName, int age, int memberID, String type,
            int duration,
            LocalDate startdate) {
        super(title, firstName, lastName, age, memberID, type, duration, startdate);
    }

    @Override
    public double feeCalculation() {
        if (this.getAge() < 12) {
            System.out.println(" Visitor " + getFirstName() + " is under 12 years old get free entrance.");
            return fee = 0.0;
        }

        if (super.getType().equalsIgnoreCase("Family")
                && super.getDuration() == 1) {
            // Couple member fee logic
            this.fee = 8.0;
            // System.out.println(" fee is " + this.member.fee);
        } else if (super.getType().equalsIgnoreCase("Family")
                && super.getDuration() == 12) {
            this.fee = 25.0;
            // System.out.println(" fee is " + this.member.fee);
        } else {
            this.fee = 0.0;
        }

        return this.fee;
    }

    @Override
    public String toString() {
        return getTitle() + " " + getFirstName() + " " + getLastName()
                + ", " + getAge() + " years old, ID number " + getMemberID() + ", type " + getType() + ", duration "
                + getDuration() + ", start date " + getStartdate() + " has " + fee + "£ of fee";
    }

}
// @Override
// public String toString() {
// return title + " " + firstName + " " + lastName + ", " + age + " years old, "
// + ", ID number " + memberID + ", type " + type + ", " + duration + ", start
// date" + startdate
// + ", owe " + fee + "£";
// }
