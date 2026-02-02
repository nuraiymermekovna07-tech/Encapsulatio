public class Main2 {
    public static void main(String[] args) {

        Car car = new Car("BMW","3",2009,245);

        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(car.getSpeed());





        car.setBrand("Mersedes");
        System.out.println(car.getBrand());
        car.setModel("3 series");
        System.out.println(car.getModel());
        car.setYear(2019);
        System.out.println(car.getYear());
        car.setSpeed(200);
        System.out.println(car.getSpeed());

        System.out.println("First sppeed:" + car.getSpeed());
        car.increaseSpeed(79);
        System.out.println("Second speed:" + car.getSpeed());
        car.decreaseSpeed(45);
        System.out.println("Third speed:" + car.getSpeed());
        car.decreaseSpeed(30);
        System.out.println("Fourth speed:" + car.getSpeed());

    }
}
