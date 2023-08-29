import java.time.LocalDate;

public class Reservation extends Flight {
    private int reservationId;
    private Traveller passenger;
    private LocalDate reservationDate;
    private String seatNumber;
    private String mealType;

    private static int nextReservationId = 0;

    // Constructor for Reservation
    public Reservation(Flight flight, Traveller passenger, LocalDate reservationDate, String seatNumber,
            String mealType) {
        super(flight.getCarrier(), flight.getFlightNumber(), flight.getDepartureCity(), flight.getArrivalCity(),
                flight.getScheduledDate(), flight.getFlightDistance());
        this.reservationId = nextReservationId++;
        this.passenger = passenger;
        this.reservationDate = reservationDate;
        this.seatNumber = seatNumber;
        this.mealType = mealType;
    }

    /*
     * public Reservation(String string, String string2, LocalDate of, double d,
     * Traveller passenger2,
     * LocalDate reservationDate2, String string3, String string4) {
     * }
     */

    // Getter and setter for Reservation ID (incremented automatically)
    public int getReservationId() {
        return reservationId;
    }

    // Getter for Flight ID (inherited from Flight class)
    public int getFlightId() {
        return super.getFlightId();
    }

    public Traveller getPassenger() {
        return passenger;
    }

    public void setPassenger(Traveller passenger) {
        this.passenger = passenger;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    // Calculate the cost of the air ticket
    public double calculateCost() {

        return 100.0 + (super.getFlightDistance() * 0.12);
    }

    // toString method
    @Override
    public String toString() {
        return "Reservation ID: " + getReservationId() +
                "\nFlight ID: " + getFlightId() +
                "\nDeparture City: " + getDepartureCity() +
                "\nArrival City: " + getArrivalCity() +
                "\nScheduled Date: " + getScheduledDate() +
                "\nFlight Distance (Miles): " + getFlightDistance() +
                "\nPassenger: " + passenger.getName() +
                "\nReservation Date: " + reservationDate +
                "\nSeat Number: " + seatNumber +
                "\nMeal Type: " + mealType +
                "\nTicket Cost: $" + calculateCost();
    }

    /*
     * public static void main(String[] args) {
     * // Example usage
     * Traveller passenger = new Traveller(1, "John Doe", "AB123456",
     * "123-456-7890", "123 Main St, City, Country",
     * "johndoe@example.com");
     * LocalDate reservationDate = LocalDate.now();
     * Reservation reservation = new Reservation("New York", "Los Angeles",
     * LocalDate.of(2023, 9, 10), 2442.5,
     * passenger, reservationDate, "A1", "Veg");
     * System.out.println(reservation.toString());
     * }
     */
}
