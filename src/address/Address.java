package address;

public class Address {
    private String country;
    private String city;
    private String postalCode;
    private String street;
    private String number;
    private String door;
    private String floor;

    public Address(String country, String city, String postalCode, String street, String number, String door, String floor) {
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.number = number;
        this.door = door;
        this.floor = floor;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDoor() {
        return this.door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getFloor() {
        return this.floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Address=" +
                "country=" + country +
                ", city=" + city +
                ", postalCode=" + postalCode +
                ", street=" + street +
                ", number=" + number  +
                ", door=" + door +
                ", floor=" + floor +
                '.';
    }
}

