import java.time.LocalDate;

public abstract class Member {

    private String title;
    private String firstName;
    private String lastName;
    private int age;
    private int memberID;
    private static int nextID = 123;
    private String type;
    private String duration;
    private LocalDate stardate;
    // private double membershipFee;
    public double fee;

    // public Member(String firstName, String lastName, int age) {
    // this.title = null;
    // this.firstName = firstName;
    // this.lastName = lastName;
    // this.age = age;
    // this.memberID = nextID++;
    // this.type = null;
    // this.duration = null;
    // this.stardate = null;
    // }

    // public Member(String title, String firstName, String lastName, int age, int
    // memberID) {
    // this.title = title;
    // this.firstName = firstName;
    // this.lastName = lastName;
    // this.age = age;
    // this.memberID = nextID++;
    // this.type = null;
    // this.duration = null;
    // this.stardate = null;
    // }

    public Member(String title, String firstName, String lastName, int age, int memberID, String type, String duration,
            LocalDate stardate) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.memberID = nextID++;
        this.type = type;
        this.duration = duration;
        this.stardate = stardate;
    }

    // adding getters
    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getMemberID() {
        return memberID;
    }

    public static int getNextID() {
        return nextID;
    }

    public String getType() {
        return type;
    }

    public String getDuration() {
        return duration;
    }

    public LocalDate getStardate() {
        return stardate;
    }

    // declaring the feeCalculation abstract class
    public abstract double feeCalculation();

    @Override
    public String toString() {
        return "Member [title=" + title + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
                + ", memberID=" + memberID + ", type=" + type + ", duration=" + duration + ", stardate=" + stardate
                + ", fee=" + fee + "]";
    }

    // public double getMembershipFee() {
    // return membershipFee;
    // }

    // public void setMembershipFee(double membershipFee) {
    // this.membershipFee = membershipFee;
    // }

    // @Override
    // public String toString() {
    // return "memberID=" + memberID + ", type=" + type + ", duration=" + duration +
    // ", stardate=" + stardate
    // + ", membershipFee=" + membershipFee;
    // }

}
