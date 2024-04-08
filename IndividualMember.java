import java.time.LocalDate;

public class IndividualMember extends Member {

    // public IndividualMember(String title, String firstName, String lastName, int
    // age, int memberID, String type,
    // String duration, LocalDate stardate) {
    // super(title, firstName, lastName, age, memberID, type, duration, stardate);
    // System.out.println("constructing individulMember Object");
    // }

    public IndividualMember(String title, String firstName, String lastName, int age, int memberID, String type,
            String duration, LocalDate stardate) {
        super(title, firstName, lastName, age, memberID, type, duration, stardate);
        System.out.println("constructing individualMember Object");
    }

    @Override
    public double feeCalculation() {
        if (this.getAge() < 12) {
            System.out.println(" Visitor " + getFirstName() + " is under 12 years old get free entrance.");
            return fee = 0.0;
        }

        if (super.getType().equalsIgnoreCase("Individual")
                && super.getDuration().equalsIgnoreCase("Monthly")) {
            // Couple member fee logic
            this.fee = 3.0;
        } else if (super.getType().equalsIgnoreCase("Individual")
                && super.getDuration().equalsIgnoreCase("Annually")) {
            this.fee = 15.0;
        } else {
            this.fee = 0.0;
        }

        return this.fee;
    }

    @Override
    public String toString() {
        return "IndividualMember Title: " + getTitle() + ", first name: " + getFirstName() + ", last name: "
                + getLastName() + ", age: " + getAge() +
                " memberID= " + getMemberID() + ", type= " + getType() + ", duration= " + getDuration() + ", stardate= "
                + getStardate() + " fee= " + feeCalculation();
    }

}
