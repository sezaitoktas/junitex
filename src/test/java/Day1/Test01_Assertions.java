package Day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01_Assertions {
    @Test
    public void test(){
        //main methodu yokken nasil calisti???
        //junit icindeki main methodu cagrildigi icin
    }
    @Test
    public void testlength(){
        String CUMLE="MERHABA DUNYAM";
       int anlikDeger= CUMLE.length();
       int beKlenenDeger=14;
       assertEquals(beKlenenDeger,anlikDeger);
    }
    @Test
    public void testUpperCase(){
        String CUMLE="aga";
       String anlikVeri= CUMLE.toUpperCase();
       String beklenenVeri="AGA";
       assertEquals(beklenenVeri,anlikVeri,"Uppercase method is not working");

    }
    @Test
    public void testToplama(){
        int sayi1=10;
        int sayi2=5;
        int anlikDeger=Math.addExact(sayi1,sayi2);
        int beklenenDeger=15;
        assertEquals(beklenenDeger,anlikDeger);

    }
    @Test
    public void testContains(){
        assertEquals(false,"Mirac".contains("z"));
    }
}
