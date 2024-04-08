public class Payment {
    public Museum museum;
    public Member member;
    public Double fee;

    public Payment(Museum museum, Member member) {
        this.museum = museum;
        this.member = member;
    }

    public double pay(Member member) {
        double fee = member.feeCalculation();
        museum.totalFee += fee;

        // this.museum.addVisitor(member);
        museum.addPayment(this);
        return fee;
    }
}

// import java.time.DayOfWeek;
// import java.time.LocalDateTime;

// public abstract class Payment {

// public Member member;
// public Visitor visitor;
// public double feeToPay;
// public LocalDateTime visitDateTime;

// public Payment(Member member) {
// this.member = member;
// this.visitDateTime = visitor.getVisitDateTime();
// }

// public Payment(Visitor visitor) {
// this.visitor = visitor;
// this.visitDateTime = visitor.getVisitDateTime();
// }

// public abstract double feeCalculation();

// public double defaultFeeCalculation() {
// // try {

// LocalDateTime visitDateTime = visitor.getVisitDateTime();

// // 1. Check for Weekend (Saturday or Sunday)
// if (visitDateTime.getDayOfWeek() == DayOfWeek.SATURDAY ||
// visitDateTime.getDayOfWeek() == DayOfWeek.SUNDAY) {
// return feeToPay = 12.0;
// }

// // 2. Check for Weekday (12 noon - 3 pm)
// int hour = visitDateTime.getHour();
// if (visitDateTime.getDayOfWeek().getValue() <= 5 && // Monday - Friday
// hour >= 12 && hour < 15) {
// return feeToPay = 7.0;
// }

// // 3. Default Weekday Fee (8 am - 5 pm)
// if (visitDateTime.getDayOfWeek().getValue() <= 5 && // Monday - Friday
// hour >= 8 && hour < 17) {
// return feeToPay = 10.0;
// }
// // } catch (Exception e) {

// // }
// return 0.0;
// }

// }

// import java.util.Scanner;

// public class Payment {
// public Museum museum;
// public Member member;
// public Double fee;

// public Boolean pay() {
// double fee = this.member.feeCalculation();
// System.out.println("do you agree with the fee that is :" + fee);
// Scanner scn = new Scanner(System.in);
// String answer = scn.nextLine();
// if (answer.startsWith("y")) {
// this.fee = fee;
// this.museum.totalFee += fee;
// // this.museum.addVisitor(member);
// this.museum.addPayment(this); // we delegated the history of payments to the
// payment class; so this would be
// // classified as a singleton
// return true;
// }
// return false;
// }

// }

// public final class Payment {
// private static Payment FEE;
// private String info = "initial info class";

// private Payment(){
// public static Payment getInstance(){
// if (FEE = null) {
// FEE = new Payment();
// } return FEE;
// }
// }
// }
