import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Testapp {
    @Test
    public void apptest(){
        assertTrue(true);
    }
    @Test
    public void test_plus(){
        assertEquals(5, app.plus(2, 3));
    }
    @Test
    public void test_multi(){
        assertEquals(10, app.multi(2, 5));
    }
}


