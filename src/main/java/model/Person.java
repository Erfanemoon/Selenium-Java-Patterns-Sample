package model;

public class Person {

    private String name;
    private String address;
    private String zip_code;
    private String lastName;

    public Person(String name, String address, String zip_code, String lastName) {
        this.name = name;
        this.address = address;
        this.zip_code = zip_code;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
