public class Customer {
    int id;
    int transactionCount;
    Address address;
    Contact contact;

    Address getAddress()
    {
        return address;
    }
    Contact getContact()
    {
        return contact;
    }
    int getTransactionCount()
    {
        return transactionCount;
    }
}
