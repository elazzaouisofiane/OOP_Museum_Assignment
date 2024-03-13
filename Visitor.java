import java.time.LocalDateTime;

public class Person {
    // Variable declaration
    private String title;
    private String firstName;
    private String lastName;
    private int age;
    private LocalDateTime visitDateTime;

    // object constructor
    public Person(String title, String firstName, String lastName, int age, LocalDateTime visitDateTime) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.visitDateTime = visitDateTime;
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

}
