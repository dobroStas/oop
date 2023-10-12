package seminar3_4;

public class Student extends User implements Comparable<Student>{
    private Long studintID;

    public Student(String firstName, String secondName, String patronymic, String dateOfBirth, Long studintID) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studintID = studintID;
    }

    public Long getStudentID() {
        return studintID;
    }

    public void setStudentID(Long studintID) {
        this.studintID = studintID;
    }

    @Override
    public String toString() {
        return "StudentID - " + studintID + ", " + "User firstName - " + super.getFirstName() + ", " + "User secondName - " + super.getSecondName() + ", " + "patronymic - "
        + super.getPatronymic() + ", " + "User dateOfBirth: " + super.getDateOfBirth();
    }

    @Override
    public int compareTo(Student o) {
        return this.studintID.compareTo(o.studintID);
    }
}
