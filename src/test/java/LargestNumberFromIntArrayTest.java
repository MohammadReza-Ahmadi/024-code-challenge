import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LargestNumberFromIntArrayTest {

    @Test
    public void test_1() {
        int[] nums = new int[]{10, 2};
        String expected = "210";
        Assertions.assertEquals(expected, new LargestNumberFromIntArray().largestNumber(nums));
    }

    @Test
    public void test_2() {
        int[] nums = new int[]{3,30,34,5,9};
        String expected = "9534330";
        Assertions.assertEquals(expected, new LargestNumberFromIntArray().largestNumber(nums));
    }

}