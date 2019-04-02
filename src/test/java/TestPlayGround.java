import Attraction.PlayGround;
import core.Visitor;
import org.junit.Before;

import static junit.framework.TestCase.assertEquals;

public class TestPlayGround {

    PlayGround playGround;
    Visitor visitor;

    @Before
    public void before(){
        playGround = new PlayGround("AAA", 4, 10.0);
    }

    public void cangetPrice(){
        assertEquals(10.0, playGround.getPrice());
    }

    public void isAllowedToVisit(){
        assertEquals(true, playGround.isAllowedTo(visitor));
    }
}
