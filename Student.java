public class Student extends Person {

    protected String idNum;
    protected double gpa;

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        this.idNum = idNum;
        this.gpa = gpa;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + ", Id: " + idNum + ", GPA: " + gpa;
    }
}
