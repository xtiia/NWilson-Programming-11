public class Main {
    public static void main(String[] args) {

        //creating school
        School coveCliff = new School("Cove Cliff", "BC","elementary");

        //adding 10 students in different ways
        Student John = new Student("John","Franks",3);
        coveCliff.addStudent(John);
        coveCliff.addNewStudent("Wesley","Banks",2);
        coveCliff.addNewStudent("Jennifer","Paisley",4);
        for (int i = 0; i < 7; i++) {
            coveCliff.addNewStudent();
        }

        //adding 3 teachers in different ways
        coveCliff.addNewTeacher();
        coveCliff.addNewTeacher("Melanie","Parker","science");
        Teacher ben = new Teacher("Ben","Gable","Pe");
        coveCliff.addTeacher(ben);

        //printing lists
        System.out.println("Students: " + coveCliff.listStudents() + "\nTeachers: " + coveCliff.listTeachers());

        //removing 2 students in different ways
        coveCliff.removeStudent(John);
        coveCliff.removeStudent(6);

        //removing teacher
        coveCliff.removeTeacher(0);

        //printing again
        System.out.println("\nStudents: " + coveCliff.listStudents() + "\nTeachers: " + coveCliff.listTeachers());
    }
}
