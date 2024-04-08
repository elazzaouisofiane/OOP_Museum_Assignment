import java.time.LocalDate;

public abstract class Member {

    private String title;
    private String firstName;
    private String lastName;
    private int age;
    private int memberID;
    private static int nextID = 123;
    private String type;
    private int duration;
    private LocalDate startdate;
    public double fee;

    public Member(String title, String firstName, String lastName, int age, int memberID, String type, int duration,
            LocalDate startdate) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.memberID = nextID++;
        this.type = type;
        this.duration = duration;
        this.startdate = startdate;
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

    public int getDuration() {
        return duration;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    // declaring the feeCalculation abstract class
    public abstract double feeCalculation();

    @Override
    public String toString() {
        return title + " " + firstName + " " + lastName + ", " + age + " years old, "
                + ", ID number " + memberID + ", type " + type + ", " + duration + ", start date" + startdate
                + ", owe " + fee + "£";
    }
}
