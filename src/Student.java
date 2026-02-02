public class Student {
    private String name;
    private String surname;
    private int age;
    private String[] courses;

    public Student(String name, String surname, int age, String[] courses) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.courses = courses;


    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    String getSurname() {
        return surname;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;





    }
    void setCourses(String[] courses) {
        this.courses = courses;
    }
    String[] getCourses() {
        return courses;
    }
}

