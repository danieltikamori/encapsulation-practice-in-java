public class Student {

    private String studentName;
    private int studentAge;
    private double studentGrade1;
    private double studentGrade2;
    private double studentGrade3;
    private double studentGrade4;

    public Student(String studentName, double studentGrade1, double studentGrade2, double studentGrade3, double studentGrade4) {
        this.studentName = studentName;
        this.studentGrade1 = studentGrade1;
        this.studentGrade2 = studentGrade2;
        this.studentGrade3 = studentGrade3;
        this.studentGrade4 = studentGrade4;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public double getStudentGrade1() {
        return studentGrade1;
    }

    public void setStudentGrade1(double studentGrade1) {
        this.studentGrade1 = studentGrade1;
    }

    public double getStudentGrade2() {
        return studentGrade2;
    }

    public void setStudentGrade2(double studentGrade2) {
        this.studentGrade2 = studentGrade2;
    }

    public double getStudentGrade3() {
        return studentGrade3;
    }

    public void setStudentGrade3(double studentGrade3) {
        this.studentGrade3 = studentGrade3;
    }

    public double getStudentGrade4() {
        return studentGrade4;
    }

    public void setStudentGrade4(double studentGrade4) {
        this.studentGrade4 = studentGrade4;
    }

    public double calculateAverageGrade(){
        return ((studentGrade1 + studentGrade2 + studentGrade3 + studentGrade4)) / 4;
    }
}
