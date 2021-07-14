import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {

  private static long aVeryBigSum(final List<Long> ar) {
    // Write your code here
    return ar.stream().reduce(Long::sum).get();
  }

  public static void main(final String[] args) throws IOException {
    final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    final int arCount = Integer.parseInt(bufferedReader.readLine().trim());

    final List<Long> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
      .map(Long::parseLong)
      .collect(toList());

    final long result = aVeryBigSum(ar);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
