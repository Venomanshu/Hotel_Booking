public class Address
{
    String addressStreet;
    String addressCity;
    String addressState;

    String getAddressDetails()
    {
        return addressStreet + "," + addressCity+","+ addressState;
    }

    void updateAddressDetails(String addressCity, String addressState, String addressStreet)
    {
     this.addressCity =addressCity;
     this.addressState= addressState;
     this.addressStreet=addressStreet;
    }
}
