/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tahmid Sajin
 */
public class Member extends Passenger{
    public int yearsOfMembership;
    
    public Member(int yearsOfMembership, String name, int age) {
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }
    
    public Member(Member member) {
        super(member.getName(), member.getAge());
        this.yearsOfMembership = member.yearsOfMembership;
    }
    
    public void setYearsOfMembership(int yearsOfMembership) {
        this.yearsOfMembership = yearsOfMembership;
    }
    
    public int getYearsOfMembership() {
        return this.yearsOfMembership;
    }
    
    public double applyDiscount(double p) {
        if (this.yearsOfMembership > 5) {
            return p * 0.5D; 
        }
        if (this.yearsOfMembership > 1) {
            return p * 0.9D; 
        }
        return p;
    }
}
