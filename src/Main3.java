public class Main3 {
    public static void main(String[] args) {
         House house1 = new House("Chuikova 132a",4,127);
        System.out.println(house1.getAddress());
        System.out.println(house1.getNumOfRooms());
        System.out.println(house1.getArea());

        house1.setNumOfRooms(3);
        System.out.println(house1.getNumOfRooms());
        house1.setArea(107);
        System.out.println(house1.getNumOfRooms());
        house1.setAddress("Isanova 12");
        System.out.println(house1.getAddress());
        System.out.println(house1.getPrice());

    }
}
