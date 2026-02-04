public class University {
    private String name;
    private String address;
    private String email;

    public University(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;

    }
    void setName(String name) {
        this.name = name;
    }
    void setAddress(String address) {
        this.address = address;
    }
    void setEmail(String email) {
        this.email = email;
    }
    String getName() {
        return name;
    }
    String getAddress() {
        return address;
    }
    String getEmail() {
        return email;
    }
}
