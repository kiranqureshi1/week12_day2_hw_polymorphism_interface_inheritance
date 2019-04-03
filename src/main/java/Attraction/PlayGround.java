package Attraction;

import core.Visitor;
import interfaces.ISecurity;

public class PlayGround extends Attraction implements ISecurity {
    private double price;

    public PlayGround(String name, int rating, double price){
        super(name, rating);
        this.price = price;
    }


    public double getPrice(){
        return this.price;
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() <= 15){
            return true;
        }
        return false;
    }

}
