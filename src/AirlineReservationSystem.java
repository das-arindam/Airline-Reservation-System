import com.arindam.flight.Flight;
import com.arindam.passenger.Passenger;
import com.arindam.reservation.Reservation;
import com.arindam.seat.Seat;

public class AirlineReservationSystem {
    public static void main(String[] args) {
    // Create a new airline reservation system
    // Create a new flight
    Flight flight = new Flight("SFO", "LAX", "10:00", "12:00", 100);
    // Create a new passenger
    Passenger passenger = new Passenger("John", "Smith", "987654321", "john.smith@email.com", "123 Main St.", "Los Angeles", "CA");
    // Create a new seat
    Seat seat = new Seat("A", "1");
    // Create a new reservation
    Reservation reservation = new Reservation(flight, passenger, seat);
    // Add the reservation to the flight
    flight.addReservation(reservation);
    // Print the flight
    flight.print();
    // Print the passenger
    passenger.print();
    // Print the reservation
    reservation.print();
    }
}
