public class Flight
{
    String flightNumber;
    String airlineName;
    int capacity;
    int bookedSeats;

    public String getFlightDetails()
    {
        return flightNumber + "," + airlineName + "," + capacity + "," + bookedSeats;
    }

    public boolean checkAvailablity()
    {
        return capacity == 0;
    }
    void incrementBookingCounter()
    {

    }
}
