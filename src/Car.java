public class Car {
    private String brand;
    private String model;
    private int year;
    private double speed;

    public Car(String brand, String model, int year, double speed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setSpeed(double speed) {
        this.speed = speed;
    }
    String getBrand() {
        return brand;
    }
    String getModel() {
        return model;
    }
    int getYear() {
        return year;
    }
    double getSpeed() {
        return speed;

            }
        }

