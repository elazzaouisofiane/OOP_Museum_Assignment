
// importing packages
// import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Museum {
    public String NAME;
    public String LOCATION;
    public double totalFee;
    private Member member;
    // public DateTimeFormatter visitDateTime = DateTimeFormatter.ofPattern("E,
    // mm");

    public static ArrayList<Member> members = new ArrayList<>();
    public static ArrayList<Payment> payments = new ArrayList<>();

    public void addVisitor(Member member) {
        members.add(member);
    }

    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    public void printMembers() {

        System.out.println("List of Museum Members:");
        for (Member member : members) {
            System.out.println(member.toString());
        }
    }

    public void printPayments() {
        System.out.println("Museum Payment History:");
        for (Payment payment : payments) {
            System.out.println("Member: " + member.getFirstName() + " " + member.getLastName() +
                    ", Fee: " + payment.fee);
        }
    }
}
