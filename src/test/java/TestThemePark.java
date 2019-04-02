import Attraction.Park;
import Stall.CandyFlossStall;
import core.ThemePark;
import interfaces.IReviewed;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestThemePark {

    ThemePark themePark;
    Park park;
    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        themePark = new ThemePark();
        park = new Park("AAA", 4);
        candyFlossStall = new CandyFlossStall("Pink", "John", 3, 3, 4.20);
    }

    @Test
    public void getIreviewedArrayCount(){
        themePark.add(park);
        themePark.add(candyFlossStall);
        assertEquals(2, themePark.getAllReviewCount());
    }
}
