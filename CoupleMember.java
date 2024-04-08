import java.time.LocalDate;

public class CoupleMember extends Member {

    // constructing the member object in the subclass

    public CoupleMember(String title, String firstName, String lastName, int age, int memberID, String type,
            int duration,
            LocalDate startdate) {
        super(title, firstName, lastName, age, memberID, type, duration, startdate);
        System.out.println("constructing coupleMember object");
    }

    @Override
    public double feeCalculation() {
        if (this.getAge() < 12) {
            System.out.println(" Visitor " + getFirstName() + " is under 12 years old get free entrance.");
            return fee = 0.0;
        }

        if (super.getType().equalsIgnoreCase("Couple")
                && super.getDuration() == 1) {
            // Couple member fee logic
            this.fee = 5.0;
        } else if (super.getType().equalsIgnoreCase("Couple")
                && super.getDuration() == 12) {
            this.fee = 20.0;
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
