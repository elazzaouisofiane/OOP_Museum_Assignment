import java.time.LocalDateTime;

public class Visitor {
    // Variable declaration
    private String title;
    private String firstName;
    private String lastName;
    private int age;
    private LocalDateTime visitDateTime;

    // object constructor
    public Visitor(String title, String firstName, String lastName, int age, LocalDateTime visitDateTime) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.visitDateTime = visitDateTime;
    }

    public Visitor(String firstName, String lastName, int age) {
        this.title = null;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.visitDateTime = LocalDateTime.now();
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

    public LocalDateTime getVisitDateTime() {
        return visitDateTime;
    }

    public void is12() {
        if (age < 12) {
            double fee = 0.0;
        }
    }

    @Override
    public String toString() {
        return " Title: " + getTitle() + ", first name: " + getFirstName() + ", last name: " + getLastName()
                + ", age: " + getAge() + ", visite date and time: " + getVisitDateTime();
    }

}
