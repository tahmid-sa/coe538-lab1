/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tahmid Sajin
 */
public class NonMember extends Passenger{
    public NonMember(String name, int age) {
        super(name, age);
    }
  
    public NonMember(NonMember nonMember) {
        super(nonMember);
    }
    
    public double applyDiscount(double p) {
        if (this.getAge() > 65)                                //this keyword is opptional here
            return p * 0.9D; 
        return p;
    }
}
