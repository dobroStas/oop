package seminar3_4;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private int counter;
    private List<Student> studentList;

    public StudentGroupIterator(List<Student> studentList) {
        this.studentList = studentList;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) return null;

        return studentList.get(counter++);
    }

public void zeroCounter(){
    this.counter = 0;
}

    @Override
    public void remove() {
        studentList.remove(counter);
    }

}
