public class main {
    public static void main (String[] args)
    {
        Passenger pName = new Passenger();
        Ticket tName = new Ticket();
        Flight fDetails = new Flight();
        RegularTicket rcTicket = new RegularTicket();
        TouristTicket tTicket = new TouristTicket();
        Address getAddress = new Address("HS street", "Chandigarh","Punjab");
        Contact getContact = new Contact("Himanshu","0000000000","himgautam@gmail.com");

        System.out.println(pName.getAddress());
    }
}
