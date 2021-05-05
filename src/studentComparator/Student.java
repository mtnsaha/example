package studentComparator;

public class Student {

    int student_id;
    String student_name;
    String student_subject;
    int student_age;


    public Student(int student_id, String student_name, String student_subject, int student_age) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_subject = student_subject;
        this.student_age = student_age;
    }

    public int getStudent_id() {
        return student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public String getStudent_subject() {
        return student_subject;
    }

    public int getStudent_age() {
        return student_age;
    }
}
