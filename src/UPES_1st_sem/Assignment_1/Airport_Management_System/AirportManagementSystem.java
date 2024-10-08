package UPES_1st_sem.Assignment_1.Airport_Management_System;

import java.util.ArrayList;
import java.util.List;

// Flight class
class Flight {
    private String flightNumber;
    private String destination;
    private String departureTime;
    private String arrivalTime;

    public Flight(String flightNumber, String destination, String departureTime, String arrivalTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public boolean isUpcoming() {
        // Implement logic to check if the flight is upcoming
        return true; // Placeholder
    }

    public void updateDepartureTime(String newDepartureTime) {
        this.departureTime = newDepartureTime;
    }

    public void updateArrivalTime(String newArrivalTime) {
        this.arrivalTime = newArrivalTime;
    }

    public void displayDetails() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Arrival Time: " + arrivalTime);
    }

    public String getFlightNumber() {
        return flightNumber;
    }
}

// Airport class
class Airport {
    private String name;
    private List<Flight> flights;

    public Airport(String name) {
        this.name = name;
        this.flights = new ArrayList<>();
    }

    private Flight findFlightByNumber(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                return flight;
            }
        }
        return null;
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void removeFlight(String flightNumber) {
        Flight flight = findFlightByNumber(flightNumber);
        if (flight != null) {
            flights.remove(flight);
        }
    }

    public List<Flight> getUpcomingFlights() {
        List<Flight> upcomingFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.isUpcoming()) {
                upcomingFlights.add(flight);
            }
        }
        return upcomingFlights;
    }

    public List<Flight> getCompletedFlights() {
        List<Flight> completedFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (!flight.isUpcoming()) {
                completedFlights.add(flight);
            }
        }
        return completedFlights;
    }

    public void displayAllFlights() {
        for (Flight flight : flights) {
            flight.displayDetails();
            System.out.println();
        }
    }
}

// Main class to test the implementation
public class AirportManagementSystem {
    public static void main(String[] args) {
        Airport airport = new Airport("Indira Gandhi International Airport");

        Flight flight1 = new Flight("AI101", "New York", "10:00 AM", "8:00 PM");
        Flight flight2 = new Flight("AI102", "London", "11:00 AM", "9:00 PM");

        airport.addFlight(flight1);
        airport.addFlight(flight2);

        System.out.println("All Flights:");
        airport.displayAllFlights();

        System.out.println("Upcoming Flights:");
        for (Flight flight : airport.getUpcomingFlights()) {
            flight.displayDetails();
        }

        airport.removeFlight("AI101");

        System.out.println("All Flights after removal:");
        airport.displayAllFlights();
    }
}
