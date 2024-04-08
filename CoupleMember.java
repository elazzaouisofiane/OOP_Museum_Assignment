import java.time.LocalDate;

public class CoupleMember extends Member {

    // constructing the member object in the subclass

    public CoupleMember(String title, String firstName, String lastName, int age, int memberID, String type,
            String duration,
            LocalDate stardate) {
        super(title, firstName, lastName, age, memberID, type, duration, stardate);
        System.out.println("constructing coupleMember object");
    }

    @Override
    public double feeCalculation() {
        if (this.getAge() < 12) {
            System.out.println(" Visitor " + getFirstName() + " is under 12 years old get free entrance.");
            return fee = 0.0;
        }

        if (super.getType().equalsIgnoreCase("Couple")
                && super.getDuration().equalsIgnoreCase("Monthly")) {
            // Couple member fee logic
            this.fee = 5.0;
        } else if (super.getType().equalsIgnoreCase("Couple")
                && super.getDuration().equalsIgnoreCase("Annually")) {
            this.fee = 20.0;
        } else {
            this.fee = 0.0;
        }

        return this.fee;
    }

    @Override
    public String toString() {
        return "CoupleMember Title: " + getTitle() + ", first name: " + getFirstName() + ", last name: " + getLastName()
                + ", age: " + getAge() + " memberID= " + getMemberID() + ", type= " + getType() + ", duration= "
                + getDuration() + ", stardate= " + getStardate() + " fee= " + fee;
    }

}
