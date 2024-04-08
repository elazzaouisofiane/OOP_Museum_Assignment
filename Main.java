
// Driver Class
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Member Sofiane = new NoneMember("Mr", "Sofiane", "El Azzaoui", 10, 0, null, 0, null,
                LocalDateTime.of(2024, 2, 3, 13, 2, 2));
        Member Rob = new NoneMember("Mr", "Rob", "Decker", 24, 0, null, 0, null,
                LocalDateTime.of(2023, 6, 15, 12, 15, 00));
        Member Cyrille = new NoneMember("Mr", "Cyrille", "Carion", 35, 0, null, 0, null,
                LocalDateTime.of(2024, 4, 8, 9, 30, 0));
        Member Arnaud = new NoneMember("Mr", "Arnaud", "Marechal", 55, 0, null, 0, null,
                LocalDateTime.of(2024, 4, 7, 16, 12, 0));
        Member George = new FamilyMember("Mr", "George", "Foreman", 19, 0, "Family", 1, LocalDate.of(2023, 11, 4));
        Member Arthur = new FamilyMember("Mr", "Arthur", "Delaunoi", 45, 0, "Family", 12, LocalDate.of(2023, 6, 2));
        Member James = new FamilyMember("Mr", "James", "Michael", 16, 0, "Family", 12, LocalDate.of(2023, 7, 2));
        Member Mohammed = new CoupleMember("Mr", "Mohammed", "BinSiddik", 18, 0, "Couple", 1, LocalDate.of(2024, 5, 1));
        Member Karim = new CoupleMember("Mr", "Karim", "Malik", 28, 0, "Couple", 12, LocalDate.of(2023, 6, 7));
        Member David = new CoupleMember("Mr", "David", "Guetta", 60, 0, "Couple", 12, LocalDate.of(2023, 7, 7));
        Member Melissa = new IndividualMember("Ms", "Melissa", "Smith", 26, 0, "Individual", 1,
                LocalDate.of(2023, 6, 30));
        Member Catherine = new IndividualMember("Ms", "Catherine", "Mount", 23, 0, "Individual", 12,
                LocalDate.of(2023, 6, 25));
        Member Khadija = new IndividualMember("Ms", "Khadija", "labess", 32, 0, "Individual", 1,
                LocalDate.of(2023, 7, 25));

        Museum museum = new Museum();

        Payment sofianepayment = new Payment(museum, Sofiane);
        double fee = sofianepayment.pay(Sofiane); // Pass Sofiane as a parameter
        System.out.println(Sofiane.getFirstName() + " Fee: " + fee + "£");
        museum.addVisitor(Sofiane);

        Payment robpayment = new Payment(museum, Rob);
        fee = robpayment.pay(Rob); // Pass Sofiane as a parameter
        System.out.println(Rob.getFirstName() + " Fee: " + fee + "£");
        museum.addVisitor(Rob);

        Payment cyrillepayment = new Payment(museum, Cyrille);
        fee = cyrillepayment.pay(Cyrille); // Pass Sofiane as a parameter
        System.out.println(Cyrille.getFirstName() + " Fee: " + fee + "£");
        museum.addVisitor(Cyrille);

        Payment arnaudpayment = new Payment(museum, Arnaud);
        fee = arnaudpayment.pay(Arnaud); // Pass Sofiane as a parameter
        System.out.println(Arnaud.getFirstName() + " Fee: " + fee + "£");
        museum.addVisitor(Arnaud);

        Payment georgepayment = new Payment(museum, George);
        fee = georgepayment.pay(George); // Pass Sofiane as a parameter
        System.out.println(George.getFirstName() + " Fee: " + fee + "£");
        museum.addVisitor(George);

        Payment jamespayment = new Payment(museum, James);
        fee = jamespayment.pay(James); // Pass Sofiane as a parameter
        System.out.println(James.getFirstName() + " Fee: " + fee + "£");
        museum.addVisitor(James);

        Payment arthurpayment = new Payment(museum, Arthur);
        fee = arthurpayment.pay(Arthur); // Pass Sofiane as a parameter
        System.out.println(Arthur.getFirstName() + " Fee: " + fee + "£");
        museum.addVisitor(Arthur);

        Payment mohammedpayment = new Payment(museum, Mohammed);
        fee = mohammedpayment.pay(Mohammed); // Pass Sofiane as a parameter
        System.out.println(Mohammed.getFirstName() + " Fee: " + fee + "£");
        museum.addVisitor(Mohammed);

        Payment karimpayment = new Payment(museum, Karim);
        fee = karimpayment.pay(Karim); // Pass Sofiane as a parameter
        System.out.println(Karim.getFirstName() + " Fee: " + fee + "£");
        museum.addVisitor(Karim);

        Payment davidpayment = new Payment(museum, David);
        fee = davidpayment.pay(David); // Pass Sofiane as a parameter
        System.out.println(David.getFirstName() + " Fee: " + fee + "£");
        museum.addVisitor(David);

        Payment melissapayment = new Payment(museum, Melissa);
        fee = melissapayment.pay(Melissa); // Pass Sofiane as a parameter
        System.out.println(Melissa.getFirstName() + " Fee: " + fee + "£");
        museum.addVisitor(Melissa);

        Payment catherinepayment = new Payment(museum, Catherine);
        fee = catherinepayment.pay(Catherine); // Pass Sofiane as a parameter
        System.out.println(Catherine.getFirstName() + " Fee: " + fee + "£");
        museum.addVisitor(Catherine);

        Payment khadijapayment = new Payment(museum, Khadija);
        fee = khadijapayment.pay(Khadija); // Pass Sofiane as a parameter
        System.out.println(Khadija.getFirstName() + " Fee: " + fee + "£");
        museum.addVisitor(Khadija);

        System.out.println("    List of the members : ");
        for (Member member : Museum.members) {
            System.out.println(member);
        }
    }
}

// Museum museumJune = new Museum();
// Museum museumJuly = new Museum();
// Museum museumAugust = new Museum();

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

// **Payment Calculation for Sofiane**
// PaymentCouple paymentForSofiane = new PaymentCouple(Sofiane);
// double fee = paymentForSofiane.feeCalculation();
// System.out.println("\nSofiane's Payment: " + fee);

// Payment ppayment = new Payment(museum, George);
// fee = ppayment.pay(nname); // Pass Sofiane as a parameter
// System.out.println("Fee: " + fee); // You can print the fee if needed
// museum.addVisitor(nname);

// Museum.members.add(Mohammed);