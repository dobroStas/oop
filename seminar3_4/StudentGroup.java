package seminar3_4;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    List<Student> studentList;
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public StudentGroup(List<Student> studentList, Teacher teacher) {
        this.studentList = studentList;
        this.teacher = teacher;
    }

    public StudentGroup(Teacher teacher1, List<Student> asList) {
    }

    @Override
    public String toString() {
        return "StudentGroup{" + "studentList = " + studentList + ",teacher = " + teacher + "}";
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this.studentList);
    }
}
