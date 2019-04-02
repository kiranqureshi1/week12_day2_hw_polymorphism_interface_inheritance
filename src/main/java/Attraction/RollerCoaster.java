package Attraction;

import core.Visitor;
import interfaces.ISecurity;
import interfaces.ITicketed;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {
    private double price;

    public RollerCoaster(String name, int rating, double price){
        super(name, rating);
        this.price = price;

    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() >= 18){
            return true;
        }
        return false;
    }

    public int getRating(){
        return this.rating;
    }
    public String getName(){
        return this.name;
    }

    public double defaultPrice(){
        return this.price;
    }
    public double priceFor(Visitor visitor){
        double newPrice = 0.0;
        if (visitor.getHeight() > 200){
            newPrice = this.price * 2;
        } return newPrice;
    }
}
