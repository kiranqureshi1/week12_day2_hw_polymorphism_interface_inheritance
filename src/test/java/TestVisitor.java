import Attraction.Park;
import core.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestVisitor {
    Visitor visitor;
    Park park;

    @Before
    public void before(){
        visitor = new Visitor(22,100, 200);
        park = new Park("AAA", 4);
    }

    @Test
    public void getAge(){
        assertEquals(22, visitor.getAge());
    }

    @Test
    public void getMoney(){
        assertEquals(100.0, visitor.getMoney());
    }

    @Test
    public void getHeight(){
        assertEquals(200, visitor.getHeight());
    }

    @Test
    public void wantToGo(){
        assertEquals(true, visitor.wantsToVisit(park, 4));
    }

}
