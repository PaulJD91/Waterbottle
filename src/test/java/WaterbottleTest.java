import com.codebase.Waterbottle;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class WaterbottleTest {

    Waterbottle buxtons;

    @Before
    public void before() {
        buxtons = new Waterbottle();
    }

    @Test
    public void hasVolume() {
        assertEquals(100, buxtons.getVolume());
    }

    @Test
    public void canDrink() {
        buxtons.drink();
        assertEquals(90, buxtons.getVolume());
    }

    @Test
    public void emptyWaterbottle() {
        buxtons.empty();
        assertEquals(0, buxtons.getVolume());
    }

    @Test
    public void fillWaterbottle() {
        buxtons.fill();
        assertEquals(100,buxtons.getVolume());
    }
}
