import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class Main {

  private static void plusMinus(final List<Integer> arr) {
    // Write your code here

    int neutral = 0;
    int positive = 0;
    int negative = 0;

    for (int number : arr) {
      if (number > 0) {
        positive++;
      } else if (number < 0) {
        negative++;
      } else {
        neutral++;
      }
    }

    System.out.println(positive / (double) arr.size());
    System.out.println(negative / (double) arr.size());
    System.out.println(neutral / (double) arr.size());
  }

  public static void main(final String[] args) throws IOException {
    final List<Integer> arr = Stream.of(-4, 3, -9, 0, 4, 1)
      .collect(toList());

    plusMinus(arr);
  }

}
