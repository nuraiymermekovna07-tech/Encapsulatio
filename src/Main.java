import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public static void main(String[] args) {
      // Student student = new Student("Nurai", "Ermekova", 18);
       // System.out.println(student.getName());
       // System.out.println(student.getSurname());
       // System.out.println(student.getAge());

        Scanner sc = new Scanner(System.in);
        Student student = new Student("Nurai","Ermekova",18, new String[]{" "});

        System.out.println("Name:");
        student.setName(sc.nextLine());
        System.out.println("Фамилия: ");
        student.setSurname(sc.nextLine());
        System.out.println("Жашы: ");
        student.setAge(sc.nextInt());
        sc.nextLine();

        System.out.println("Kancha course");
        int num = sc.nextInt();
        sc.nextLine();

        String [] courses = new String[num];

        for (int i = 0; i < num; i++) {
            courses[i] = sc.nextLine();

        }
        student.setCourses(courses);
        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student.getAge());

        System.out.println("Courses:");
        for(String c : student.getCourses()){
            System.out.println("- " + c);
        }
    }
    }