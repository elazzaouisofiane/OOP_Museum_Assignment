public class PaymentFamily extends Payment {
    public PaymentFamily(Member member) {
        super(member);
    }

    @Override
    public double feeCalculation() {
        if (member.getMembershipType() == MembershipType.FAMILY
                && member.getDurationMonth().equalsIgnoreCase("Monthly")) {
            // Individual member fee logic
            return 8.0;
        } else if (member.getMembershipType() == MembershipType.FAMILY
                && member.getDurationMonth().equalsIgnoreCase("Annually")) {
            return 25.0;
        } else {
            // Delegate to another appropriate Payment subclass
            return defaultFeeCalculation();
        }
    }
}
