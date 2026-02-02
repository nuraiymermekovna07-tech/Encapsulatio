public class Rectangle {
    private int width;
    private int length;
    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
    void setWidth(int width) {
        this.width = width;
    }
    void setLength(int length) {
        this.length = length;
    }
    int getWidth() {
        return width;
    }
    int getLength() {
        return length;
    }
    int getArea() {
        return width * length;
    }
}
