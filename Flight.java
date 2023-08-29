import java.time.LocalDate;

public class Flight {
    private String carrier;
    private String flightNumber;
    private String departureCity;
    private String arrivalCity;
    private LocalDate scheduledDate;
    private double flightDistance; // Miles
    private int flightId;

    // Constructor
    public Flight(String carrier, String flightNumber, String departureCity, String arrivalCity,
            LocalDate scheduledDate, double flightDistance) {
        this.carrier = carrier;
        this.flightNumber = flightNumber;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.scheduledDate = scheduledDate;
        this.flightDistance = flightDistance;
    }

    // Getters and setters
    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public double getflightDistance() {
        return flightDistance;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public LocalDate getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(LocalDate scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public String getFlightIdAsString() {
        return String.valueOf(flightId);
    }

    // toString method
    @Override
    public String toString() {
        return "\nCarrier:" + carrier +
                "\nFlightNumber:" + flightNumber +
                "\nDeparture City: " + departureCity +
                "\nArrival City: " + arrivalCity +
                "\nScheduled Date: " + scheduledDate +
                "\nFlight Distance (Miles): " + flightDistance;
    }

    public static void main(String[] args) {
        // Example usage
        Flight flight = new Flight("American Airlines", "AA281", "DFW", "ICN", LocalDate.of(2023, 9, 15), 6835.70);
        System.out.println(flight.toString());
    }

    public double getFlightDistance() {
        return 0;
    }
}
