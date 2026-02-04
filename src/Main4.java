public class Main4 {
    public static void main(String[] args) {
        University university1 = new University("BGU","Isanova 12","UNI.bgu");
        university1.setName("AUCA");
        university1.setAddress("Chuy 123");
        university1.setEmail("uni.AUCA");

        University university2 = new University("KRSU","Toktogula 89","uni.KRSU");
        university2.setName("Manas");
        university2.setAddress("Tynalieva 1/3");
        university2.setEmail("uni.manas");

        University university3 = new University("UCA","NARYN","uni.UCA");

        University [] universities = new University[3];
        universities[0] = university1;
        universities[1] = university2;
        universities[2] = university3;

        Car car1 = new Car ("Toyota","Camry",2026,30.0);
        car1.setBrand("BMW");
        car1.setModel("third");
        car1.setYear(2018);
        car1.setSpeed(60.0);

        Car car2 = new Car ("Niva","second model",1998,30.0);
        car2.setBrand("Mersedes");
        car2.setModel("third");
        car2.setYear(2023);
        car2.setSpeed(80.0);

        Car car3 = new Car ("Subaru","outback",2025,70.0);
        car3.setBrand("BMW");
        car3.setModel("third");
        car3.setYear(2024);
        car3.setSpeed(80.0);

        Car[] cars = new Car[3];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;

        School school1 = new School("School num 70",35,"Bilogy");
        school1.setName("num 13");
        school1.setAge(34);
        school1.setFaculty("History");

        School school2 = new School("School num 90",95,"Religion");
        school2.setName("num 14");
        school2.setAge(35);
        school2.setFaculty("History");

        School school3 = new School("School num 80",10,"Religion");
        school3.setName("num 15");
        school3.setAge(55);
        school3.setFaculty("Art");

        School[] schools = new School[3];
        schools[0] = school1;
        schools[1] = school2;
        schools[2] = school3;


        Person person1 = new Person("Nuraiym",18,"It developer");
        person1.setName("Aidana");
        person1.setAge(19);
        person1.setJob("Doctor");

        Person person2 = new Person("Aizat",18,"Model");
        person2.setName("Altynai");
        person2.setAge(19);
        person2.setJob("Teacher");

        Person person3 = new Person("Burak",18,"School");
        person3.setName("Atai");
        person3.setAge(19);
        person3.setJob("University");
        Person[] persons = new Person[3];
        persons[0] = person1;
        persons[1] = person2;
        persons[2] = person3;

        System.out.println("Universities: ");
            for (University u : universities) {
                System.out.println(u.getName() + " " + u.getAddress() + " " + u.getEmail());
            }
        System.out.println("Cars :");
            for (Car c : cars) {
                System.out.println(c.getBrand() + " " + c.getModel() + " " + c.getYear() + " " + c.getSpeed());


            }
        System.out.println("Schools: ");
            for (School s : schools) {
                System.out.println(s.getName() + " " + s.getAge() + " " + s.getFaculty());
            }
        System.out.println("Persons: ");
            for (Person p : persons) {
                System.out.println(p.getName() + " " + p.getAge() + " " + p.getJob());
            }









        

                ;
    }

}
