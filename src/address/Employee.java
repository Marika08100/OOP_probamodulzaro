package address;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private final List<Address> addressLists;

    public Employee() {
        this.addressLists = new ArrayList<>();

    }

    public void addAddress(Address address) {
        this.addressLists.add(address);
    }

    public List<Address> getAddressLists() {
        return this.addressLists;
    }

    public void removeAddress(Address address) {
        this.addressLists.remove(address);
    }

    public Address findAddress(String country, String city, String postalCode) {
        for (Address address : addressLists) {
            if (address.getCountry().equals(country) &&
                    address.getCity().equals(city) &&
                    address.getPostalCode().equals(postalCode)) {
                return address;
            }
        }
        return null;

    }

    @Override
    public String toString() {
        return "Employee:" +
                "addressLists=" + addressLists + ".";
    }
}


