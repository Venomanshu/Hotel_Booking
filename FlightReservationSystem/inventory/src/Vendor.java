public class Vendor {
    int id;
    float credit;
    Product[] products;
    Order[] orders;

    Contact contact;
    Address address;

    Address getAddress()
    {
        return address;
    }
    Contact getContact()
    {
        return contact;
    }
}
