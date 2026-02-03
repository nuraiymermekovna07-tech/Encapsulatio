public class House {
    private String address;
    private int numOfRooms;
    private int area;

    public House(String address, int numOfRooms, int area) {
        this.address = address;
        this.numOfRooms = numOfRooms;
        this.area = area;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    void setArea(int area) {
        this.area = area;
    }

    String getAddress() {
        return address;
    }

    int getNumOfRooms() {
        return numOfRooms;
    }

    int getArea() {
        return area;

    }

    int getPrice() {
        return 900 * numOfRooms;

    }
}
