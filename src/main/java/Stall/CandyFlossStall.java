package Stall;

import core.Visitor;
import interfaces.ITicketed;

public class CandyFlossStall extends Stall implements ITicketed {

    public CandyFlossStall(String name, String ownerName, int parkingSpot, int rating, double price){
        super(name, ownerName, parkingSpot, rating, price);
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

