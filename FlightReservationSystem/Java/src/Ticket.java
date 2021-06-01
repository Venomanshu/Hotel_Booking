public class Ticket {
    int id;
    int pnrNumber;
    String flightName;
    String destinationLocation;
    String departureTime;
    String arrivalTime;
    Passenger passenger;
    float price;
    boolean cancelled;

    public String checkStatus()
    {
        return flightName + "," + destinationLocation + "," + departureTime + "," + arrivalTime + "," + passenger;
    }
    String getflightDuration()
    {
        return departureTime;
    }
    void cancel()
    {

    }
}
