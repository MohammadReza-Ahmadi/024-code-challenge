import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberOfSegmentsInStringTest {

    @Test
    public void test_1() {
        String s = "Hello,";
        int expected = 1;
        Assertions.assertEquals(expected, new NumberOfSegmentsInString().countSegments(s));
    }

    @Test
    public void test_2() {
        String s = "Hello, my name is John";
        int expected = 5;
        Assertions.assertEquals(expected, new NumberOfSegmentsInString().countSegments(s));
    }

    @Test
    public void test_3() {
        String s = "Hi   ";
        int expected = 1;
        Assertions.assertEquals(expected, new NumberOfSegmentsInString().countSegments(s));
    }

    @Test
    public void test_4() {
        String s = "Hi   Bob";
        int expected = 2;
        Assertions.assertEquals(expected, new NumberOfSegmentsInString().countSegments(s));
    }

    @Test
    public void test_5() {
        String s = "                ";
        int expected = 0;
        Assertions.assertEquals(expected, new NumberOfSegmentsInString().countSegments(s));
    }

    @Test
    public void test_6() {
        String s = "";
        int expected = 0;
        Assertions.assertEquals(expected, new NumberOfSegmentsInString().countSegments(s));
    }

    @Test
    public void test_7() {
        String s = "a, b, c";
        int expected = 3;
        Assertions.assertEquals(expected, new NumberOfSegmentsInString().countSegments(s));
    }

}