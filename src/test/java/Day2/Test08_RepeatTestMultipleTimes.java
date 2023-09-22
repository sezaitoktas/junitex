package Day2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test08_RepeatTestMultipleTimes {
    //Testi tekrarltamak istersek???
    @RepeatedTest(5)
   // @Disabled EGER CLASS SEVIYESINDE CALISTIRMAK ISTEYIM BU METHODU TEST ETMEK ISTEMIYORSAK BU ANNOTATION KULLANILIR
    void testSubstring(){
        assertEquals("Java","Java is OOP language".substring(0,4));
        System.out.println("test calisti");
    }
    //2.Ornek
    Random rm= new Random();
    @RepeatedTest(3)
    void testMatchExact(){
        int sayi1= rm.nextInt(10);
        int sayi2= rm.nextInt(10);
        assertEquals(sayi1+sayi2,Math.addExact(sayi1,sayi2));
        System.out.println("sayi1: "+sayi1+" sayi2:"+sayi2);

    }
}
