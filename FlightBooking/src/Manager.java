/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Tahmid Sajin
 */
public class Manager {
    public static List<Flight> flights = new ArrayList<>();
    public static List<Ticket> issuedTickets = new ArrayList<>();
    public static int flightNumber = 1;
  
    public static void createFlights() {
        flights.add(new Flight(flightNumber++, "Toronto", "London", generateDepartureTime(7, 5, 2020, 2, 30), 100, 100.0D));
        flights.add(new Flight(flightNumber++, "Toronto", "Vancouver", generateDepartureTime(7, 5, 2020, 3, 30), 100, 40.0D));
        flights.add(new Flight(flightNumber++, "Toronto", "Montreal", generateDepartureTime(7, 5, 2020, 4, 30), 100, 50.0D));
    }
    
    public static String generateDepartureTime(int month, int date, int year, int hour, int minute) {
        return month + "/" + date + "/" + year + " " + hour + ":" + minute;              //Will have to do something about the am/pm thing of the times, but for now it is in the 24 hour format
    }
    
    public static void displayAvailableFlights(String origin, String destination) {
        for (Flight f : flights) {
            if (f.getDestination().equals(destination) && f.getOrigin().equals(origin)) {
                System.out.println(f.toString());
            }
        }
    }
    
    public static Flight getFlight(int flightNumber) {
        for (Flight f : flights) {
            if (f.getFlightNumber() == flightNumber) {
                return f;
            }
        }
        return (Flight)null;
    } 
    
    public static boolean bookSeat(int flightNumber, Passenger p) {
        Flight f = getFlight(flightNumber);
        
        if (f != null) {
            if (f.bookASeat()) {
                issuedTickets.add(new Ticket(p, f));
                return true;
            }     
            return false;
        }
        return false;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        createFlights();
        
        displayAvailableFlights(((Flight)flights.get(0)).getOrigin(), ((Flight)flights.get(0)).getDestination());
        displayAvailableFlights(((Flight)flights.get(1)).getOrigin(), ((Flight)flights.get(1)).getDestination());
        displayAvailableFlights(((Flight)flights.get(2)).getOrigin(), ((Flight)flights.get(2)).getDestination());
        
        int c;
        
        for (c = 0; c < ((Flight)flights.get(0)).getCapacity(); c++) {
            if (c % 2 != 0) {
                bookSeat(((Flight)flights.get(0)).getFlightNumber(), new Member(c % 10, Integer.toString(c), c % 50));
            } 
            else {
                bookSeat(((Flight)flights.get(0)).getFlightNumber(), new NonMember(Integer.toString(c), c % 70));
            } 
        } 
        for (c = 0; c <= ((Flight)flights.get(1)).getCapacity(); c++) {
            if (c % 2 != 0) {
                bookSeat(((Flight)flights.get(1)).getFlightNumber(), new Member(c % 10, Integer.toString(c), c % 50));
            } 
            else {
                bookSeat(((Flight)flights.get(1)).getFlightNumber(), new NonMember(Integer.toString(c + 100), c % 70));
            } 
        } 
        for (c = 0; c <= ((Flight)flights.get(2)).getCapacity() + 1; c++) {
            if (c % 2 != 0) {
                bookSeat(((Flight)flights.get(2)).getFlightNumber(), new Member(c % 10, Integer.toString(c), c % 50));
            } 
            else {
            bookSeat(((Flight)flights.get(2)).getFlightNumber(), new NonMember(Integer.toString(c + 200), c % 70));
            } 
        }
        
        for (Ticket t : issuedTickets) {
            System.out.println(t); 
        }
        
        Passenger passenger = new Member(5, "Tahmid", 20);
        System.out.println(passenger.getAge());
        System.out.println(passenger.getName());
        
        //Testing with other users
        passenger.setAge(70);
        passenger.setName("Bob");
        System.out.println(passenger.getAge());
        System.out.println(passenger.getName());
        Ticket t = new Ticket(passenger, flights.get(0));
        System.out.println(t);
    }   
}
