package core;

import Attraction.Attraction;
import interfaces.IReviewed;
import interfaces.ISecurity;
import interfaces.ITicketed;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {

    private ArrayList<IReviewed> Ireviewed;
    private ArrayList<ISecurity> Isecurity;
    private ArrayList<ITicketed> Iticketed;

    public ThemePark(){
        this.Ireviewed = new ArrayList<>();
        this.Isecurity = new ArrayList<>();
        this.Iticketed = new ArrayList<>();
    }

    public ArrayList getAllReviews(){
        return this.Ireviewed;
    }

    public void add(IReviewed place){
        this.Ireviewed.add(place);
    }

    public int getAllReviewCount(){
        return this.Ireviewed.size();
    }

    public boolean visit(Visitor visitor, Attraction playGround){
        if (visitor.wantsToVisit(playGround, 4) == true){
            return true;
        }
        return false;

    }

    public ArrayList getAllAllowedFor(Visitor visitor){
        return this.Ireviewed;
    }

//    public String getAllReviewsString(){
//        for (place : Ireviewed){
//           place.
//        }
//
//    }
}
