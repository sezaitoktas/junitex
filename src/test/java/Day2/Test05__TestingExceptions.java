package Day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test05__TestingExceptions {
    //test ettigimiz method bekledigimiz exception i firlatti mi???
    @Test
    void testException(){
        String str= "Merhaba Dunya";
    assertThrows(NullPointerException.class,()->{
        System.out.println("testException() calisti");
        str.length();
    });
    }
    //Bolme islemi icin Arithmetic Exception kontrolu
    @Test
    void testException2(){
        int sayi1=1;
        int sayi2=0;
        assertThrows(ArithmeticException.class,()->
        {
            System.out.println(sayi1/sayi2);
        });
    }
    @Test
    void testException3(){
        int sayi1=1;
        int sayi2=0;
        assertThrows(ArithmeticException.class,()->{
            divide(sayi1,sayi2);
        });


    }
    private int divide(int a,int b){
        return a/b;
    }
}
