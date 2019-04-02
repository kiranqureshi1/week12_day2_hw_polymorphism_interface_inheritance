import Stall.CandyFlossStall;
import Stall.TobaccoStall;
import core.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCandyFloss {

    CandyFlossStall candyFlossStall;
    Visitor visitor;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("AAA", "John", 3, 4, 6.60);
        visitor = new Visitor(22,100, 200);
    }


    @Test
    public void getDefaultPrice(){
        assertEquals(6.60, candyFlossStall.defaultPrice());
    }

    @Test
    public void getPriceForVisitor(){
        assertEquals(0.00, candyFlossStall.priceFor(visitor));
    }
}
