package Stall;

import core.Visitor;
import interfaces.ISecurity;
import interfaces.ITicketed;

public class IceCreamStall extends Stall {

    public IceCreamStall(String name, String ownerName, int parkingSpot, int rating, double price){
        super(name, ownerName, parkingSpot, rating, price);
    }

}
