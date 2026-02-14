package acet_Devops.Jenkins_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CserocksTest {

    Cserocks cal = new Cserocks();

    @Test
    void testAdd() {
        int result = cal.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testMul() {
        int result = cal.mul(2, 3);
        assertEquals(6, result);
    }
}
