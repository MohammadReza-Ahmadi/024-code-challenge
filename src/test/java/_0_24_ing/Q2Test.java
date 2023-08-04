package _0_24_ing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Q2Test {

    @Test
    public void test1(){
        int n = 1234;
        int ex = 4321;
        Assertions.assertEquals(ex, Q2.rev(n));
    }

    @Test
    public void test2(){
        int n = 1;
        int ex = 1;
        Assertions.assertEquals(ex, Q2.rev(n));
    }

    @Test
    public void test3(){
        int n = 12;
        int ex = 21;
        Assertions.assertEquals(ex, Q2.rev(n));
    }



}