package core;

import Attraction.Attraction;

public class Visitor {
    private int age;
    private double money;
    private int height;

    public Visitor(int age, double money, int height){
        this.age = age;
        this.money = money;
        this.height = height;

    }

    public int getAge(){
        return this.age;
    }

    public double getMoney(){
        return this.money;
    }

    public int getHeight(){
        return this.height;
    }

    public boolean wantsToVisit(Attraction place, int preferedrating){
        if (preferedrating == place.getRating()){
            return true;
        }
        return false;
    }


}
