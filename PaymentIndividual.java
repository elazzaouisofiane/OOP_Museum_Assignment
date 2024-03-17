public class PaymentIndividual extends Payment {
    public PaymentIndividual(Member member) {
        super(member);
    }

    @Override
    public double feeCalculation() {
        if (member.getMembershipType() == MembershipType.INDIVIDUAL
                && member.getDurationMonth().equalsIgnoreCase("Monthly")) {
            // Individual member fee logic
            return 3.0;
        } else if (member.getMembershipType() == MembershipType.INDIVIDUAL
                && member.getDurationMonth().equalsIgnoreCase("Annually")) {
            return 15.0;
        } else {
            // Delegate to another appropriate Payment subclass
            return defaultFeeCalculation();
        }
    }

}
