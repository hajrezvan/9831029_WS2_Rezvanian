/**
 * The Student class represents a student in a student
 * administration system.
 * It holds the student details relevant in our context.
 *
 * @author Rezvanian
 * @version 0.0
 */
public class Student {

    // the student first name
    private String firstName;

    // the student last name
    private String lastName;

    // the student ID
    private int id;

    // the grade
    private int grade;


    /**
     * Create a new student with a given name and ID number.
     *
     * @param firstName first name of student.
     * @param lastName  last name of student.
     * @param id        student ID.
     */
    public Student(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        grade = 0;
    }

    /**
     * getting first name of student.
     *
     * @return first name of student.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * setting first name of student.
     *
     * @param firstName first name of student.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * getting last name of student.
     *
     * @return last name of student.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * setting last name of student.
     *
     * @param lastName last name of student.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * getting student ID.
     *
     * @return student ID.
     */
    public int getId() {
        return id;
    }

    /**
     * setting student ID.
     *
     * @param id student ID.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getting student grade.
     *
     * @return student grade.
     */
    public int getGrade() {
        return grade;
    }

    /**
     * setting student grade.
     *
     * @param grade student grade.
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * print student information.
     */
    public void print() {
        System.out.println(lastName + ", student ID: " +
                id + ", grade: " + grade);
    }
}
