import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {

  private static void miniMaxSum(final List<Integer> arr) {
    // Write your code here

    final ArrayList<Long> list = new ArrayList<>();
    long max = 0;
    long min = Long.MAX_VALUE;

    for(int i = 0; i < arr.size(); i++) {
      int counter = 0;
      long sum = 0;

      while (counter < arr.size()) {
        if (counter != i) sum += arr.get(counter);
        counter++;
      }

      if (sum > max) max = sum;
      if (sum < min) min = sum;
    }

    System.out.println(min + " " + max);
  }

  public static void main(final String[] args) throws IOException {

    final List<Integer> arr = Stream.of(1,2,3,4,5)
      .collect(toList());

    miniMaxSum(arr);
  }

}
