package seminar3_4;

public class User {
    private String firstName;
    private String secondName;
    private String patronymic;
    private String dateOfBirth;

    public User(String firstName, String secondName, String patronymic, String dateOfBirth) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        ;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
        ;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setsecondName(String secondName) {
        this.secondName = secondName;
        ;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return "User firstName - " + firstName + "\"" + "User secondName - " + secondName + "\"" + "patronymic - "
                + patronymic + "\"" + "User dateOfBirth" + dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;

        if (getFirstName() != null ? !getFirstName().equals(user.getFirstName()) : user.getFirstName() != null) {
            return false;
        }
        if (getSecondName() != null ? !getSecondName().equals(user.getSecondName()) : user.getSecondName() != null) {
            return false;
        }
        if (getPatronymic() != null ? !getPatronymic().equals(user.getPatronymic()) : user.getPatronymic() != null) {
            return false;
        }
        return getDateOfBirth() != null ? getDateOfBirth().equals(user.getDateOfBirth())
                : user.getDateOfBirth() == null;
    }
}
