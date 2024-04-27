
// importing packages
import java.util.ArrayList;

public class Museum {
    public static final String NAME = "Museum";
    public static final String LOCATION = "Country Z";
    public double totalFee;
    private Member member;

    public static ArrayList<Member> members = new ArrayList<>();
    public static ArrayList<Payment> payments = new ArrayList<>();

    public void addVisitor(Member member) {
        member.setFeePaid(0.0);
        members.add(member);
    }

    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    public void printMembers() {

        System.out.println("List of Museum Members:");
        for (Member member : members) {
            System.out.println(member.toString() + ", Fee Paid: " + member.getFeePaid());
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
