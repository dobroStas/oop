package seminar3_4;


public class Teacher extends User{
    private Long teacherID;
    public Teacher(String firstName, String secondName, String patronymic, String dateOfBirth, Long teacherID) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherID = teacherID;
    }

    public Long getTeacherID(){
        return teacherID;
    }

    public void setTeacherID(Long teacherID){
        this.teacherID = teacherID;
    }
}
