import java.util.ArrayList;

public class School {
    /*schools have arraylists of teachers students and courses as well as a name region and type.
    it can also add remove or show students and teachers on its list*/
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<String> courses = new ArrayList<>();

    private String name;
    private String region;
    private String type;

    //Constructors
    School(){
        name = "Seycove";
        region = "BC";
        type = "secondary";
    }
    School(String name, String region, String type){
        this.name = name;
        this.region = region;
        this.type = type;
    }

    /*i've realized that all the functions below to do with array list could be done by something like exampleschool.teachers.add(whatever)
     so i made them private because the assignment says to make functions for it*/
    //add teacher or student
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    public void addStudent(Student student){
        students.add(student);
    }

    //add new teacher or student
    public void addNewTeacher(String firstName, String lastName, String subject){
        teachers.add(new Teacher(firstName, lastName, subject));
    }
    public void addNewTeacher(){
        teachers.add(new Teacher());
    }
    public void addNewStudent(String firstName, String lastName, int grade){
        students.add(new Student(firstName, lastName, grade));
    }
    public void addNewStudent(){
        students.add(new Student());
    }

    //remove teacher or student by name or index
    public void removeTeacher(Teacher teacher){
        teachers.remove(teacher);
    }
    public void removeTeacher(int index){
        teachers.remove(index);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }
    public void removeStudent(int index){
        students.remove(index);
    }

    //list teachers or students
    public String listTeachers(){
        return teachers.toString();
    }
    public String listStudents(){
        return students.toString();
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
