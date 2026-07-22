public class Student {
    public int rowNo;
    public int studentId;
    public String firstName;
    public String lastName;
    public String section;
    public int grade;
    public String email;

    public Student(int rowNo, int studentId, String firstName, String lastName, String section, int grade, String email) {
        this.rowNo = rowNo;
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.section = section;
        this.grade = grade;
        this.email = email;
    }

    public String studentInfo() {
        return rowNo + " | " + studentId + " | " + firstName + " " + lastName + " | Sec " + section + " | Grade " + grade;
    }
}
