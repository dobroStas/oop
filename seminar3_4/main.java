package seminar3_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Ivanov", "Ivanovich", "1.1.1", 111L);
        Student student2 = new Student("Petr", "Petrov", "Petrovich", "2.2.2", 222L);
        Student student3 = new Student("Sergey", "Sergeev", "Sergeevich", "3.3.3", 333L);

        Teacher teacher1 = new Teacher("Anna", "Ananova", "Ananovna", "4.4.4", 444L);
        Teacher teacher2 = new Teacher("Maria", "Marieva", "Marievna", "5.5.5", 555L);

        // Creating student groups
        StudentGroup group1 = new StudentGroup(teacher1, Arrays.asList(student1, student2));
        StudentGroup group2 = new StudentGroup(teacher2, Arrays.asList(student3));

        // Creating streams
        Stream stream1 = new Stream(Arrays.asList(group1));
        Stream stream2 = new Stream(Arrays.asList(group1, group2));

        List<Stream> streams = Arrays.asList(stream1, stream2);

        UserController userController = new UserController();
        userController.sortStreams(streams);

        // Printing sorted streams
        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getNumberOfGroups() + " groups.");
        }
        // test1();
        // test3();
    }

    public static void test1() {
        Student student1 = new Student("1", "1", "1", "1.1.1", 111L);
        Student student2 = new Student("2", "2", "2", "2.2.2", 222L);
        Student student3 = new Student("3", "3", "3", "3.3.3", 333L);
        Student student4 = new Student("4", "4", "4", "4.4.4", 444L);
        Teacher teacher5 = new Teacher("5", "5", "5", "5.5.5", 555L);
        List<Student> studentList1 = new ArrayList<>(List.of(new Student[] { student1, student2, student3, student4 }));
        List<Student> studentList2 = List.of(new Student[] { student1, student2, student3, student4 });

        StudentGroupIterator sgi1 = new StudentGroupIterator(studentList1);
        StudentGroupIterator sgi2 = new StudentGroupIterator(studentList2);

        sgi1.next();
        sgi1.remove();
        sgi1.zeroCounter();
        StudentGroup studentGroup1 = new StudentGroup(studentList2, teacher5);

        for (Student student : studentGroup1) {
            System.out.println(student);
        }

        System.out.println(
                "-------------------------------------------------------------------------------------------------");
        while (sgi1.hasNext())
            System.out.println(sgi1.next());

    }

    public static void test3() {
        Student student1 = new Student("1", "1", "1", "1.1.1", 111L);
        Student student2 = new Student("2", "2", "2", "2.2.2", 222L);
        Student student3 = new Student("3", "3", "3", "3.3.3", 333L);
        Student student4 = new Student("4", "4", "4", "4.4.4", 444L);
        Teacher teacher5 = new Teacher("5", "5", "5", "5.5.5", 555L);
        List<Student> studentList3 = new ArrayList<>(List.of(new Student[] { student4, student2, student1, student3 }));
        StudentGroupIterator sgi3 = new StudentGroupIterator(studentList3);

        while (sgi3.hasNext())
            System.out.println(sgi3.next());
        System.out.println(
                "-------------------------------------------------------------------------------------------------");        
        Collections.sort(studentList3, new StudentComporator());
        for (Student student : studentList3) {
            System.out.println(student);
        }
    }
}
