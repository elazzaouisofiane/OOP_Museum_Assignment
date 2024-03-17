import java.time.DayOfWeek;
import java.time.LocalDateTime;

public abstract class Payment {

    protected Member member;
    protected Visitor visitor;
    public double fee;
    // public LocalDateTime visitDateTime;

    public Payment(Member member) {
        this.member = member;
    }

    public Payment(Visitor visitor) {
        this.visitor = visitor;
    }

    public abstract double feeCalculation();

    public double defaultFeeCalculation() {
        LocalDateTime visitDateTime = visitor.getVisitDateTime();

        // 1. Check for Weekend (Saturday or Sunday)
        if (visitDateTime.getDayOfWeek() == DayOfWeek.SATURDAY ||
                visitDateTime.getDayOfWeek() == DayOfWeek.SUNDAY) {
            return 12.0;
        }

        // 2. Check for Weekday (12 noon - 3 pm)
        int hour = visitDateTime.getHour();
        if (visitDateTime.getDayOfWeek().getValue() <= 5 && // Monday - Friday
                hour >= 12 && hour < 15) {
            return 7.0;
        }

        // 3. Default Weekday Fee (8 am - 5 pm)
        if (visitDateTime.getDayOfWeek().getValue() <= 5 && // Monday - Friday
                hour >= 8 && hour < 17) {
            return 10.0;
        }

        // Handle outside of visiting hours (or unexpected logic)
        return 0.0;
    }

}
