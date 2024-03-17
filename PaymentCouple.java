public class PaymentCouple extends Payment {
    public PaymentCouple(Member member) {
        super(member);
    }

    @Override
    public double feeCalculation() {
        if (member.getMembershipType() == MembershipType.COUPLE
                && member.getDurationMonth().equalsIgnoreCase("Monthly")) {
            // Individual member fee logic
            return 5.0;
        } else if (member.getMembershipType() == MembershipType.COUPLE
                && member.getDurationMonth().equalsIgnoreCase("Annually")) {
            return 20.0;
        } else {
            // Delegate to another appropriate Payment subclass
            return defaultFeeCalculation();
        }
    }
}
