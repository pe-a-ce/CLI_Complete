import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Disabled
    @Test
    void displayMenu() {

        fail();
    }

    @Disabled
    @Test
    void addNewFlight() {

        fail();
    }


    @Disabled
    @Test
    void addPassenger() {

        fail();
    }

    @Test
    void bookAPassenger__test() {
//        Given
        Passenger testPassenger = new Passenger("Rick", "Roll", "u_got_rolled@rolled.com", 1);
        Flight testFlight = new Flight(Destination.PALMA, 12);
        Airport testAirport = new Airport();

//        When
        testAirport.addPassengerToFlight(testPassenger, testFlight);

//        Then
        assertEquals("Rick", testFlight.getPassengers().get(0).getFirstName());
    }

    @Test
    void cancelAnExistingFlight__withOneFlightAdded() {
//        Given
        Airport testAirport = new Airport();
        testAirport.addFlight(Destination.HAWAII, 999);

//        When
        testAirport.removeFlight(testAirport.getAllFlights().get(0));

//        Then
        assertTrue(testAirport.getAllFlights().isEmpty());
    }

    @Test
    void cancelAnExistingFlight__withTwoFlightsAdded() {
//        Given
        Airport testAirport = new Airport();
        testAirport.addFlight(Destination.HAWAII, 999);
        testAirport.addFlight(Destination.LONDON, 666);

//        When
        testAirport.removeFlight(testAirport.getAllFlights().get(0));
        testAirport.removeFlight(testAirport.getAllFlights().get(0));


//        Then
        assertTrue(testAirport.getAllFlights().isEmpty());
    }





    @Disabled
    @Test
    void passengerNotFound() {
//        ByteArrayInputStream testIn = new ByteArrayInputStream();
        //System.setIn(new PrintStream(testIn));
        //ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        final String testString = "Hello!";
    }
}