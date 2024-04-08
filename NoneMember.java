import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class NoneMember extends Member {

    // declaring the visitDateTime variables needed to calculate the fee
    private LocalDateTime visitDateTime;

    // constructing noneMember
    public NoneMember(String title, String firstName, String lastName, int age, int memberID, String type,
            int duration, LocalDate startdate, LocalDateTime visitDateTime) {
        super(title, firstName, lastName, age, memberID, type, duration, startdate);
        this.visitDateTime = visitDateTime;
    }

    // Concrete Method declaration
    @Override
    public double feeCalculation() {

        // 1. Check if visitor age is above 12:
        if (this.getAge() < 12) {
            System.out.println(" Visitor " + getFirstName() + " is under 12 years old get free entrance.");
            return fee = 0.0;
        }

        // Declaring hour variables locally
        int hour = visitDateTime.getHour();

        // 2. Check for Weekend (Saturday or Sunday between 8am and 5pm) using
        // procedural programmation:
        if (visitDateTime.getDayOfWeek() == DayOfWeek.SATURDAY && hour >= 8 && hour < 17 ||
                visitDateTime.getDayOfWeek() == DayOfWeek.SUNDAY) {
            return this.fee = 12.0;
        }

        // 3. Check for Weekday (12 noon - 3 pm)
        // int hour = visitDateTime.getHour();
        if (visitDateTime.getDayOfWeek().getValue() <= 5 && // Monday - Friday
                hour >= 12 && hour < 15) {
            return this.fee = 7.0;
        }

        // 4. Default Weekday Fee (8 am - 5 pm)
        if (visitDateTime.getDayOfWeek().getValue() <= 5 && // Monday - Friday
                hour >= 8 && hour < 17) {
            return this.fee = 10.0;
        }
        System.out
                .println("The museum is open from 8am to 5pm every day of the week. Please select appropriate time. ");
        return 0.0;
    }

    @Override
    public String toString() {
        return getTitle() + " " + getFirstName() + " " + getLastName() + ", " + getAge() + " years old, ID number "
                + getMemberID()
                + " visited the museum the "
                + visitDateTime + " without membership has " + fee + "£ of fee";
    }
}
