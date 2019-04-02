import Attraction.Dodgem;
import core.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestDodgem {
    Dodgem dodgem;
    Visitor visitor;

    @Before
    public void before(){
        dodgem = new Dodgem("AAA", 4, 12);
        visitor = new Visitor(10,100, 200);
    }

    @Test
    public void canGetRating(){
        assertEquals(4, dodgem.getRating());
    }

    @Test
    public void canGetName(){
        assertEquals("AAA", dodgem.getName());
    }

    @Test
    public void canGetDefaultPrice(){
        assertEquals(12.0, dodgem.defaultPrice());
    }

    @Test
    public void canGetPriceFor(){
        assertEquals(6.0, dodgem.priceFor(visitor));
    }
}
