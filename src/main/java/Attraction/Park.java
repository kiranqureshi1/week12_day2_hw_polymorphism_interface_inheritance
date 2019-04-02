package Attraction;

public class Park extends Attraction{

    public Park(String name, int rating){
        super(name, rating);
    }

    public int getRating(){
        return this.rating;
    }
    public String getName(){
        return this.name;
    }
}
