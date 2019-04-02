import Stall.TobaccoStall;
import core.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestTobaccoStall {
    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("AAA", "John", 3, 4, 6.60);
        visitor = new Visitor(22,100, 200);
    }

    @Test
    public void getIsAllowedToVisit(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void getDefaultPrice(){
        assertEquals(6.60, tobaccoStall.defaultPrice());
    }

    @Test
    public void getPriceForVisitor(){
        assertEquals(0.00, tobaccoStall.priceFor(visitor));
    }
}
