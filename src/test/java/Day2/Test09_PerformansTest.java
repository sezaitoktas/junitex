package Day2;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Test09_PerformansTest {
    //TASK OLARAK VERILEN SORUNUN COZUMU MAX IKI SANIYEDE VERMESINI ISTIYORSAM
    @Test
    void testPrintPerformance(){
        assertTimeout(Duration.ofSeconds(2),()-> IntStream.rangeClosed(1,10000).forEach(System.out::println));
    }
    @Test
    void testPerformance(){
        assertTimeout(Duration.ofSeconds(3),
                ()-> IntStream.rangeClosed(1,50000).reduce((x,y)->Math.addExact(x,y)));
    }
}
