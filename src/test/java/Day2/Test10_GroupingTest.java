package Day2;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test10_GroupingTest {
    ///Amacimiz birbirleriyle iliskili teestleri gruplamak
    //carpma ve toplama islemlerini icin yazilan test metodlarini gruplayacagiz.
    @Nested
    class MultiplyTest {
        //sadece carpma islemi ilgili methodlari gruplamis oldum.
        @ParameterizedTest
        @CsvSource(value = {"-12,-4,3", "12,4,3"})
        void testMultiplyWithNoneZero(int rs, int x, int y) {
            assertEquals(rs, Math.multiplyExact(x, y));
        }

        @ParameterizedTest
        @CsvSource(value = {"0,0,3", "0,4,0"})
        void testMultiplyWithZero(int rs, int x, int y) {
            assertEquals(rs, Math.multiplyExact(x, y));
        }
    }
    @Nested
    class AddTest {
        @ParameterizedTest
        @CsvSource(value = {"-1,-4,3", "5,4,1"})
        void testAddWithNonZero(int rs, int x, int y) {
            assertEquals(rs, Math.addExact(x, y));
        }

        @ParameterizedTest
        @CsvSource(value = {"3,-0,3", "1,0,1"})
        void testAddWithZero(int rs, int x, int y) {
            assertEquals(rs, Math.addExact(x, y));
        }
    }



}
