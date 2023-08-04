import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberOfProvincesTest {

    @Test
    public void test_1() {
        int[][] isConnected = new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        Assertions.assertEquals(1, new NumberOfProvinces().findCircleNum(isConnected));
    }

    @Test
    public void test_2() {
        int[][] isConnected = new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        Assertions.assertEquals(3, new NumberOfProvinces().findCircleNum(isConnected));
    }

}