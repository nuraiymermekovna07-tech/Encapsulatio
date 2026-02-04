public class School {
    private String name;
    private int age;
    private String faculty;

    public School(String name, int age, String faculty) {
        this.name = name;
        this.age = age;
        this.faculty = faculty;
    }
    void setName(String surname) {
        this.name = surname;

    }
    void setAge(int age) {
        this.age = age;
    }
    void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getFaculty() {
        return faculty;
    }
}
