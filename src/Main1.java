public class Main1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getLength());
        rectangle.setWidth(4);
        System.out.println(rectangle.getWidth());
        rectangle.setLength(14);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getArea());
    }
}