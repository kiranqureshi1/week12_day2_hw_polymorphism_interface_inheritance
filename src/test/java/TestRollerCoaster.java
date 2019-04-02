import Attraction.RollerCoaster;
import core.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestRollerCoaster {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("AAA", 4, 10);
        visitor = new Visitor(22,100, 300);
    }

    @Test
    public void canGetRating(){
        assertEquals(4, rollerCoaster.getRating());
    }

    @Test
    public void canGetName(){
        assertEquals("AAA", rollerCoaster.getName());
    }

    @Test
    public void canGetDefaultPrice(){
        assertEquals(10.0, rollerCoaster.defaultPrice());
    }

    @Test
    public void canGetPriceFor(){
        assertEquals(20.0, rollerCoaster.priceFor(visitor));
    }
}
