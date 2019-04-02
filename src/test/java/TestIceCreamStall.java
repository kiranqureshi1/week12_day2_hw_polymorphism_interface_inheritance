import Stall.CandyFlossStall;
import Stall.IceCreamStall;
import core.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestIceCreamStall {

    IceCreamStall iceCreamStall;
    Visitor visitor;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("AAA", "John", 3, 4, 6.60);
        visitor = new Visitor(22,100, 200);
    }


    @Test
    public void getDefaultPrice(){
        assertEquals(6.60, iceCreamStall.defaultPrice());
    }

    @Test
    public void getPriceForVisitor(){
        assertEquals(0.00, iceCreamStall.priceFor(visitor));
    }
}
