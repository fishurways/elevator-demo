import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestTest {
    @Test
    public void waitTime(){
        Request req1 = new Request(1, 4, 3);
        Assertions.assertEquals(9, req1.calculateWaitTime(3, 12));
    }
}