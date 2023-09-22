package Day1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test02_Assertions {
    //Bazen yapacagimiz testlerde "Bu dogru degil mi" seklinde kontroller yapmamm gerekebilir.
    @Test
    public void testToFindMin(){
       //assertTrue(Math.min(4,10)==4);
        assertFalse(Math.min(4,10)==4);
    }
    @Test
    public void testSplit(){
        String str="Test islemi cok kolay";
        String[] anlikDizi=str.split(" ");
        String[] beklenenDizi={"Test","islemi","cok","kolay"};
        assertTrue(Arrays.equals(beklenenDizi,anlikDizi));
    }
}
