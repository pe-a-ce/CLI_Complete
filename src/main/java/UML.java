public class UML {

/*

    * ------------------- * ---------------------------* ---------------------------------------------------------- *
    |      Passenger      |           Flight           |        Airport                                             |
    * ------------------- * -------------------------- * ---------------------------------------------------------- *
    | - firstName: String | - destination: String      | - allFlights: List <Flight>                                |
    | - lastName: String  | - flightID: int            |                                                            |
    | - email: String     | - Passengers: ArrayList    |                                                            |
    | - passportID: int   |                            |                                                            |
    * ------------------- * -------------------------- * ---------------------------------------------------------- *
    | Constructor         |  Getters + Setters         | displayFlights(): void                                     |
    | Getters + Setters   | addPassenger(Passenger)    | addPassengerToFlight(Passenger passenger, Flight flight)   |
    | toString  : String  | removePassenger(Passenger) | addFlight(Destination destination, int flightID)           |
    |                     |                            | removeFlight()                                             |
    |                     |                            | List<Flight> getAllFlights()                               |
    * ------------------- * -------------------------- * ---------------------------------------------------------- *

    * ----------------------- *   --------------------------------------------------  *
    |    Destination: Enum    |                        Main                           |
    * ----------------------- * ----------------------------------------------------- *
    | MIAMI, LONDON,          |   ukAirport : Airport                                 |
    | PALMA,  PARIS           |   emptyPassengers : List<Passenger>                   |
    | BARCELONA,  HAWAII      |                                                       |
    |                         |                                                       |
    * ----------------------- * ----------------------------------------------------- *
    |                         | switch (case options 0 - 5)                           |
    |                         |  addNewFlight() "while loop/ try catch"               |
    |                         |  displayFLights()                                     |
    |                         |  addPassenger() "while loop/ try catch"               |
    |                         |  bookAPassenger()                                     |
    |                         |  cancelAnExistingFlight() "while loop/ try catch/ if" |
    |                         |  passengerNotFound() : Passenger                      |
    * ----------------------- * ----------------------------------------------------- *







 */
}
