package seminar3_4;

import java.util.List;

public class UserController {

    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final UserView userView = new UserView();
    private final StreamService streamService = new StreamService();

    public void createStudent(String firstName, String secondName, String patronymic, String dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        List<User> userList = dataService.getAll();
        userView.sendOnConsole(userList);
    }

    public void createStudentGroup(Teacher teacher, List<Student> students) {
        studentGroupService.createStudentGroup(students,teacher);
    }

    public Student getStudentInStudentGroup(String firstName, String secondName) {
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    }

    public List<Student> getSortedListStudentFromStudentGroup() {
        return studentGroupService.getSortedStudentGroup();
    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup() {
        return studentGroupService.getSortedByFIOStudentGroup();
    }

    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }
}