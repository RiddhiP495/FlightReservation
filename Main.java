/*import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

       Traveller traveller = new Traveller(1, "John Doe", "AB123456", "123-456-7890", "123 Main St, City, Country",
                "johndoe@example.com");
        System.out.println(traveller.toString());

        Flight flight = new Flight(1, "New York", "Los Angeles", LocalDate.of(2023, 9, 10), 2442.5);
        System.out.println(flight.toString());

        Traveller passenger = new Traveller(1, "John Doe", "AB123456", "123-456-7890", "123 Main St, City, Country",
                "johndoe@example.com");
        LocalDate reservationDate = LocalDate.now();

        Reservation reservation = new Reservation("New York", "Los Angeles", LocalDate.of(2023, 9, 10), 2442.5,
                passenger, reservationDate, "A1", "Veg");
        System.out.println(reservation.toString());  

        
    }

}*/

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create objects to represent flights
        Flight flight1 = new Flight("American Airlines", "AA281", "DFW", "ICN", LocalDate.of(2023, 9, 15), 6835.70);
        Flight flight2 = new Flight("Air Canada", "AC306", "YVR", "YUL", LocalDate.of(2023, 9, 20), 2291.00);
        Flight flight3 = new Flight("Southwest Airlines", "WN3855", "PHX", "STL", LocalDate.of(2023, 9, 25), 1261.38);

        // Create objects to represent passengers
        Traveller traveller1 = new Traveller(0, "Bob Smith", "AB123456", "123-456-7890", "255 Main Street",
                "bob@example.com");
        Traveller traveller2 = new Traveller(1, "Abigail Diaz", "CD789012", "987-654-3210", "100 Eastern Avenue",
                "abigail@example.com");

        // Create lists
        List<Traveller> travellers = new ArrayList<>();
        List<Flight> airlineFlights = new ArrayList<>();
        List<Reservation> reservations = new ArrayList<>();

        // Add Bob and Abigail to the list of travellers
        travellers.add(traveller1);
        travellers.add(traveller2);

        // Retrieve Abigail from the list of travellers and update her email and
        // passport number
        Traveller abigail = travellers.get(1);
        abigail.setEmailAddress("abigail.updated@example.com");
        abigail.setPassportNumber("AB123456");

        // Display all travellers and their information
        System.out.println("List of Travellers:");
        for (Traveller traveller : travellers) {
            System.out.println(traveller.toString());
            System.out.println("-------------------------");
        }

        // Add flights to the list of airline flights
        airlineFlights.add(flight1);
        airlineFlights.add(flight2);
        airlineFlights.add(flight3);

        // Retrieve flight WN3855 from the list of flights and update its departure date
        for (Flight flight : airlineFlights) {
            if (flight.getFlightIdAsString().equals("WN3855")) {
                flight.setScheduledDate(LocalDate.of(2023, 10, 1));
                break;
            }
        }

        // Display all flights and their information
        System.out.println("\nList of Flights:");
        for (Flight flight : airlineFlights) {
            System.out.println(flight.toString());
            System.out.println("-------------------------");
        }

        // Create reservations
        Reservation reservation1 = new Reservation(flight1, traveller1, LocalDate.of(2023, 9, 15), "A1", "Veg");
        Reservation reservation2 = new Reservation(flight3, traveller2, LocalDate.of(2023, 9, 25), "B2", "Non-Veg");

        // Add reservations to the list of reservations
        reservations.add(reservation1);
        reservations.add(reservation2);

        // Output a list of all reservations
        System.out.println("\nList of Reservations:");
        for (Reservation reservation : reservations) {
            System.out.println(reservation.toString());
            System.out.println("-------------------------");
        }

        // Retrieve Bob's reservation from the list of reservations
        Reservation bobReservation = null;
        for (Reservation reservation : reservations) {
            if (reservation.getPassenger().getName().equals("Bob Smith")) {
                bobReservation = reservation;
                break;
            }
        }

        // Output Bob's reservation
        System.out.println("\nBob's Reservation:");
        System.out.println(bobReservation.toString());
        System.out.println("-------------------------");

        // Change Bob's seat number and meal type
        bobReservation.setSeatNumber("C3");
        bobReservation.setMealType("Veg");

        // Output the updated reservation information
        System.out.println("\nUpdated Reservation for Bob:");
        System.out.println(bobReservation.toString());
        System.out.println("-------------------------");

        // Output the cost of Bob's flight ticket
        double bobTicketCost = bobReservation.calculateCost();
        System.out.println("\nCost of Bob's Flight Ticket: $" + bobTicketCost);
    }
}
