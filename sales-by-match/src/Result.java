import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {
  /*
   * Complete the 'sockMerchant' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER n
   *  2. INTEGER_ARRAY ar
   */

  public static int sockMerchant(final int n, final List<Integer> ar) {
    final Map<Integer, List<Integer>> collect = ar
      .stream()
      .collect(Collectors.groupingBy(Integer::intValue));

    int pairs = 0;

    for (final Map.Entry<Integer, List<Integer>> color : collect.entrySet()) {
      pairs += color.getValue().size() / 2;
    }

    return pairs;
  }

  public static void main(final String[] args) throws IOException {
    final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    final int n = Integer.parseInt(bufferedReader.readLine().trim());

    final List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
      .map(Integer::parseInt)
      .collect(toList());

    final int result = Result.sockMerchant(n, ar);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
