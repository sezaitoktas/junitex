package Day1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test03_BeforeEach_AfterEach {
    String str;
    @BeforeEach
    void beforeEach(){
        str="JUnit5 is better than JUnit4";
        System.out.println("******BeforeEach() calisti***************");

    }
    @AfterEach
    void afterEach(){
        str=null;
        System.out.println("******AfterEach() calisti***************");
    }
    @Test
    public void testSplit(TestInfo info){
        String str="Test islemi cok kolay";
        String[] anlikDizi=str.split(" ");
        String[] beklenenDizi={"Test","islemi","cok","kolay"};
        assertTrue(Arrays.equals(beklenenDizi,anlikDizi));
        System.out.println(info.getDisplayName()+" calisti");
    }
    @Test
    void testLength(){
        int anlikdeger=str.length();
        int bekleneDeger=28;
        assertEquals(bekleneDeger,anlikdeger);
    }
}
