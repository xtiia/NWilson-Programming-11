public class Student {
    //students have first and last names, grades, and a unique id generated on construction
    private String firstName;
    private String lastName;
    private int grade;
    private static int studentNum = 1;
    private int studentId;

    //constructors
    Student(){
        firstName = "Billy";
        lastName = "Kelper";
        grade = 1;
        //making unique id
        studentId = studentNum;
        studentNum++;
    }
    Student(String firstName, String lastName, int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        //making unique id
        studentId = studentNum;
        studentNum++;
    }

    //returns name and grade when printed
    public String toString(){
        return "Name: " + this.firstName + " " + this.lastName + " Grade: " + this.grade;
    }

    //getters and setters (set id and set student number excluded because that would probably break things)
    public int getStudentId() {
        return studentId;
    }

    public static int getStudentNum() {
        return studentNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
