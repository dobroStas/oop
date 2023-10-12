package seminar3_4;
import java.util.ArrayList;
import java.util.List;

public class DataService {

    private List<User> users;

    public DataService() {
        this.users = new ArrayList<>();
    }

    public List<User> getAll(){
        return this.users;
    }

    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        Long countMaxId = 0L;
        for (User user: this.users){
            if(user instanceof Student){
                if (((Student) user).getStudentID() > countMaxId){
                    countMaxId = ((Student) user).getStudentID();
                }
            }
        }
        countMaxId++;

        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        this.users.add(student);
    }
}