/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tahmid Sajin
 */
public class Ticket {
    public Passenger passenger;
    public Flight flight;
    public double price;
    public int number;
    public static int ticketNumber = 1;
    
    public Ticket(Passenger p, Flight flight, double price) {
        this.passenger = p;
        this.flight = flight;
        this.price = price;
        this.number = ticketNumber++;
    }
    
    public Ticket(Ticket ticket) {
        this.passenger = ticket.getPassenger();
        this.flight = ticket.getFlight();
        this.price = ticket.getPrice();
        this.number = ticket.getNumber();
    }
    
    public Ticket(Passenger p, Flight flight) {
        this.passenger = p;
        this.flight = flight;
    }
    
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    
    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public Passenger getPassenger() {
        return this.passenger;
    }
    
    public Flight getFlight() {
        return this.flight;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public int getNumber() {
        return this.number;
    }
    
    public String toString() {
        return this.passenger.getName() + ", Flight " + this.flight.getFlightNumber() + ", " + this.flight.getOrigin() + " to " + this.flight.getDestination() + ", " + this.flight.getDepartureTime() + ", original price: " + this.flight.getOriginalPrice() + ", ticket price: " + this.getPrice();
    }
}


