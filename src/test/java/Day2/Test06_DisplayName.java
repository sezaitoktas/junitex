package Day2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test06_DisplayName {
    //DISPLAY ANNOTATION ILE EKRANDA BIR ACIKLAMA YAZABILIRIZ TEST HAKKINDA
    @Test
    @DisplayName("Test ParseInt() to check if it is throwing for non digit value")
    void testException(){
        String str="Merhaba";

        assertThrows(NumberFormatException.class,()->{
            Integer.parseInt(str);

        });//Integer.parseInt(str) Format Exception firlatacak mi??
    }
}
