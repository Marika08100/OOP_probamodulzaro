package address;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Address address1 = new Address("HU", "Budapest", "537470", "Malom", "22A", "B", "3");
        Address address2 = new Address("RO", "Szekelyudvarhely", "537500", "Tamasi Aron", "6", "11", "2A");

        employee.addAddress(address1);
        employee.addAddress(address2);

        List<Address> addressList = employee.getAddressLists();
        for (var actual : addressList) {
            System.out.println(actual);
        }

    }
}
