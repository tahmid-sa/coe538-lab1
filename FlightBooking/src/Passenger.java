/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tahmid Sajin
 */
public abstract class Passenger {
    public String name;
    public int age;
    
    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Passenger(Passenger passenger) {
        this.name = passenger.getName();
        this.age = passenger.getAge();
    }
    
    public void setName(String name) {
        this.name = name;
    }
  
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }
  
    public int getAge() {
        return this.age;
    }
    
    public abstract double applyDiscount(double p);
}
