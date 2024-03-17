
// Driver Class
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Member Sofiane = new Member("Mr", "Sofiane", "El Azzaoui", 38, null, "month", null, MembershipType.COUPLE);
        Member George = new Member("Mr", "George", "Redman", 10, LocalDateTime.of(2024, 3, 2, 10, 30, 00), null, null,
                null);
        Member Mohammed = new Member("Mr", "Mohammed", "BinSiddik", 16, LocalDateTime.of(2024, 5, 1, 15, 1, 00));

        Museum.memberList.add(Sofiane);
        Museum.memberList.add(George);
        Museum.memberList.add(Mohammed);

        for (Member member : Museum.memberList) {
            System.out.println(member);
        }

        // **Payment Calculation for Sofiane**
        PaymentCouple paymentForSofiane = new PaymentCouple(Sofiane);
        double fee = paymentForSofiane.feeCalculation();
        System.out.println("\nSofiane's Payment: " + fee);
    }
}