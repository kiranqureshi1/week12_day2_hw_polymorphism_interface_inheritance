package Attraction;

import core.Visitor;
import interfaces.ITicketed;

public class Dodgem extends Attraction implements ITicketed {
    private double price;

    public Dodgem(String name,int rating, double price){
        super(name, rating);
        this.price = price;
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
        double kidsPrice = 0.0;
        if(visitor.getAge() < 12){
            kidsPrice = this.price/2;
        }return kidsPrice;
    }


}
