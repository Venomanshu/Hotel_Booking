public class Address extends Passenger{
String street;
String city;
String state;

    Address(String street, String city, String state)
    {
        this.street=street;
        this.city=city;
        this.state=state;
        return;
    }

 private String getAddressDetails()
 {
    return street + "," + city + "," + state;
 }
 void updateAddressDetails(String street, String city, String state)
 {
     this.street =street;
     this.state =state;
     this.city =city;
 }


}

