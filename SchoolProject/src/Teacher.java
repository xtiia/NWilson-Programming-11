public class Teacher {

    //teachers have first and last names and subjects
    private String firstName;
    private String lastName;
    private String subject;

    //constructors
    Teacher(){
        firstName = "Joe";
        lastName = "Biden";
        subject = "Math";
    }
    Teacher(String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    //returns name and subject when object is printed
    public String toString(){
        return "Name: " + this.firstName + " " + this.lastName + " Subject: " + this.subject;
    }

    //getters and setters
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
