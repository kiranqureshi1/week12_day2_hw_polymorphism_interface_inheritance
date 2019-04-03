package Stall;

import core.Visitor;
import interfaces.IReviewed;
import interfaces.ISecurity;
import interfaces.ITicketed;

import java.util.ArrayList;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, int parkingSpot, int rating, double price){
        super(name, ownerName, parkingSpot, rating, price);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getHeight() > 145 && visitor.getAge() > 12){
            return true;
        }return false;
    }
}
