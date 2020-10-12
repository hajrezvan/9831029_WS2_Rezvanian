public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    public Lab(String day, int capacity) {
        this.day = day;
        this.capacity = capacity;
        avg = 0;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Lab(int cap, String d) {
    }

    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }

    public void print() {
        for (Student s :
                students) {
            System.out.println(s.getLastName()
                    + ", ID number: " + s.getId()
                    + ", Grade: " + s.getGrade());
        }
    }

    public void calculateAvg() {
        for (Student student : students) {
            avg += student.getGrade();
        }
    }
}
