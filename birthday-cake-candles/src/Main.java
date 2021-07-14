import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {

  private static int birthdayCakeCandles(final List<Integer> candles) {
    // Write your code here
    int max = 0;
    int sum = 0;

    for (final int candleSize : candles) {
      if (candleSize > max) {
        max = candleSize;
        sum = 1;
      } else if (candleSize == max) {
        sum++;
      }
    }

    return sum;
  }

  public static void main(final String[] args) throws IOException {
    final List<Integer> candles = Stream.of(4,4,2,1,4)
      .collect(toList());

    System.out.println(birthdayCakeCandles(candles));
  }

}
