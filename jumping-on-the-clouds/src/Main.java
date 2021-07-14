import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {

  private static int jumpingOnClouds(final List<Integer> c) {
    // Write your code here
    int jumps = 0;
    int i = 0;
    final int limit = c.size() - 1;

    while (i < c.size()) {
      if (c.get(i) == 1) {
        i++;
        continue;
      }

      if (i != 0) {
        jumps++;
      }

      if (i + 1 <= limit && c.get(i + 1) == 0) {
        if (i + 2 <= limit && c.get(i + 2) == 0) {
          i++;
        }
      }

      i++;
    }

    return jumps;
  }

  private static int secondSolution(final List<Integer> c) {
    int jumps = 0;
    int i = 0;
    int size = c.size();

    while (i < size - 1) {
      if (i + 2 > size || c.get(i + 2) == 1) {
        i++;
      } else {
        i += 2;
      }

      jumps++;
    }

    return jumps;
  }

    public static void main(final String[] args) throws IOException {
//    final List<Integer> c = Stream.of(0, 0, 0, 0, 1, 0) // expected 3
//    final List<Integer> c = Stream.of(0, 0, 1, 0, 0, 1, 0) // expected 4
//    final List<Integer> c = Stream.of(0, 0, 0, 1, 0, 0) // expected 3
//    final List<Integer> c = Stream.of(0, 0, 1, 0, 0, 0, 0, 1, 0, 0)  // expected 6
//    final List<Integer> c = Stream.of(0, 0, 1, 0, 0, 0)  // expected 3
    final List<Integer> c = Stream.of(0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0)  // expected 53
      .collect(toList());

    final int result = secondSolution(c);

    System.out.println(result);
  }

}
