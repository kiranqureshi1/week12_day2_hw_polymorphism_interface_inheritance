package Stall;

import interfaces.IReviewed;
import interfaces.ITicketed;

public abstract class Stall implements IReviewed, ITicketed {
    protected String name;
    protected String ownerName;
    protected int parkingSpot;
    protected int rating;
    protected  double price;

    public Stall(String name, String ownerName, int parkingSpot, int rating, double price){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
        this.price = price;
    }

    public int getRating(){
        return this.rating;
    }
    public String getName(){
        return this.name;
    }
}
