package Day1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test04_BeforeAll_AfterAll {
    @BeforeAll
    static void beforeAll(){
        System.out.println("***************BeforeAll calisti*****************");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("close a file");
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
    void testLength(TestInfo info){
        String str="Test islemi cok kolay";
        int anlikdeger=str.length();
        int bekleneDeger=21;
        assertEquals(bekleneDeger,anlikdeger);
        System.out.println(info.getDisplayName()+" calisti");
    }
}
