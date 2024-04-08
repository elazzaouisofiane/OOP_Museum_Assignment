
// Driver Class
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Member Sofiane = new Member ("Sofiane", "El Azzaoui", 38);
        // FamilyMember George = new Member("Mr", "George", "Redman", 10, "Family",
        // "Annually", LocalDate.of(2024, 3, 2));
        Member Sofiane = new NoneMember(null, "Sofiane", "El Azzaoui", 10, 0, null, null, null,
                LocalDateTime.of(2024, 2, 3, 13, 2, 2));
        // Member Rob = new NoneMember(null, "Rob", "Decker", 24, 0, null, null, null);

        Member George = new FamilyMember("Mr", "George", "Foreman", 19, 0, "Family", "Monthly",
                LocalDate.of(2023, 11, 4));
        Member Mohammed = new CoupleMember("Mr", "Mohammed", "BinSiddik", 18, 0, "Couple", "Annually",
                LocalDate.of(2024, 5, 1));
        // Member Mohammed = new Member("Mr", "Mohammed", "BinSiddik",
        // 16,0,"Couple","Annually", LocalDate.of(2024, 5, 1));
        // IndividualMember Mohammed = new IndividualMember("Mr", "Mohammed",
        // "Bensiddik", 38, 0, "Individual", "Annually",
        // LocalDate.of(2024, 1, 1));

        Museum museum = new Museum();
        Museum museumJune = new Museum();
        Museum museumJuly = new Museum();
        Museum museumAugust = new Museum();

        // museum.addVisitor(Mohammed); // Mohamend -> mohammed

        Payment sofianepayment = new Payment(museum, Sofiane);
        double fee = sofianepayment.pay(Sofiane); // Pass Sofiane as a parameter
        System.out.println(Sofiane.getFirstName() + " Fee: " + fee + "£"); // You can print the fee if needed
        museum.addVisitor(Sofiane);

        Payment georgepayment = new Payment(museum, George);
        fee = georgepayment.pay(George); // Pass Sofiane as a parameter
        System.out.println(George.getFirstName() + " Fee: " + fee + "£"); // You can print the fee if needed
        museum.addVisitor(George);

        Payment mohammedpayment = new Payment(museum, George);
        fee = mohammedpayment.pay(Mohammed); // Pass Sofiane as a parameter
        System.out.println(Mohammed.getFirstName() + " Fee: " + fee + "£"); // You can print the fee if needed
        museum.addVisitor(Mohammed);

        // Payment ppayment = new Payment(museum, George);
        // fee = ppayment.pay(nname); // Pass Sofiane as a parameter
        // System.out.println("Fee: " + fee); // You can print the fee if needed
        // museum.addVisitor(nname);

        // Museum.members.add(Mohammed);

        System.out.println("    List of the members : ");
        for (Member member : Museum.members) {
            System.out.println(member);
        }

        System.out.println();

        // **Payment Calculation for Sofiane**
        // PaymentCouple paymentForSofiane = new PaymentCouple(Sofiane);
        // double fee = paymentForSofiane.feeCalculation();
        // System.out.println("\nSofiane's Payment: " + fee);
    }
}
// public class PaymentCouple extends Payment {
// // public PaymentCouple(Member member) {
// // super(member);
// // }

// // @Override
// // public double feeCalculation() {
// // double calculatedFee = 0.0;

// // if (member.getType().equalsIgnoreCase("Couple")
// // && member.getDuration().equalsIgnoreCase("Monthly")) {
// // // Couple member fee logic
// // calculatedFee = 5.0;
// // } else if (member.getType().equalsIgnoreCase("Couple")
// // && member.getDuration().equalsIgnoreCase("Annually")) {
// // calculatedFee = 20.0;
// // } else {
// // // Delegate to another appropriate Payment subclass
// // calculatedFee = super.defaultFeeCalculation();
// // }
// // this.feeToPay = calculatedFee;
// // return this.feeToPay;
// // }
// // }