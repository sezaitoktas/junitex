package Day2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test07_ParameterizedTest {
    ////Asgidaki metodda 4 defa assertTrues yazdik bunu daha clean yazabiliriz.
    @Test
    void testLength(){
        assertTrue("Mirac".length()>0);
        assertTrue("Sez".length()>0);
        assertTrue("Merari".length()>0);
    }
    @ParameterizedTest
    @ValueSource(strings = {"Mirac","Sez","Merari"})
    void testLength2(String str){
        assertTrue(str.length()>0);
    }
    //2.ornek::
    @ParameterizedTest
    @ValueSource(ints = {10,11,12})
    void testSum(Integer sayi1){
        assertTrue(sayi1>5);
    }
    //ORNEK3
    @ParameterizedTest
   @CsvSource(value = {"MERHABA, merhaba","JAVA, java"})
    void testUpperCase2(String str1,String str2){
        assertEquals(str1,str2.toUpperCase());
    }
    //Ornek4
    @ParameterizedTest
    @CsvSource(value = {"true,java,a","true,hunit,u"})
    void testContains(boolean b1,String str1, String str2){
        assertEquals(b1,str1.contains(str2));

    }
}
