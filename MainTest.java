import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

  @Test
  public void testV1() {
    Assertions.assertEquals(0, Main.minBitFlips(0, 0));
    Assertions.assertEquals(3, Main.minBitFlips(10, 7));
    Assertions.assertEquals(3, Main.minBitFlips(3, 4));
    Assertions.assertEquals(1, Main.minBitFlips(4, 5));

    // 480 (111100000), 511 (111111111)
    Assertions.assertEquals(5, Main.minBitFlips(480, 511));

    // 1073741824 (1000000000000000000000000000000), 2147483647 (1111111111111111111111111111111)
    Assertions.assertEquals(30, Main.minBitFlips(1073741824, 2147483647));

    // 1107832834 (1000010000010000011000000000010), 2147483647 (1111111111111111111111111111111)
    Assertions.assertEquals(25, Main.minBitFlips(1107832834, 2147483647));
  }

  @Test
  public void testV2() {
    Assertions.assertEquals(0, Main.minBitFlipsV2(0, 0));
    Assertions.assertEquals(3, Main.minBitFlipsV2(10, 7));
    Assertions.assertEquals(3, Main.minBitFlipsV2(3, 4));
    Assertions.assertEquals(1, Main.minBitFlipsV2(4, 5));

    // 480 (111100000), 511 (111111111)
    Assertions.assertEquals(5, Main.minBitFlipsV2(480, 511));

    // 1073741824 (1000000000000000000000000000000), 2147483647 (1111111111111111111111111111111)
    Assertions.assertEquals(30, Main.minBitFlipsV2(1073741824, 2147483647));

    // 1107832834 (1000010000010000011000000000010), 2147483647 (1111111111111111111111111111111)
    Assertions.assertEquals(25, Main.minBitFlipsV2(1107832834, 2147483647));
  }
}
