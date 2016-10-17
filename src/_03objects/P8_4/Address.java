package _03objects.P8_4;

/**
 * Created by yangmei555 on 2016/10/16.
 */
public class Address {
    private int houseNumber, postalCode;
    private String street, city, state, apartmentNumber;
    public Address(int houseNumber, String street, String apartmentNumber, String city, String state, int postalCode){
        this.houseNumber = houseNumber;
        this.street = street;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }
    public Address(int houseNumber, String street, String city, String state, int postalCode){
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }
    public void print(){
        System.out.println(street);
        System.out.println(city + ' ' + state + ' ' + postalCode);
    }
    public boolean comesBefore(Address other){
        if (postalCode < other.postalCode)
            return true;
        else
            return false;
    }
}
