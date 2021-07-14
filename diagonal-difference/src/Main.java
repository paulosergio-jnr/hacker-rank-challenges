import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class Main {

  private static int diagonalDifference(final List<List<Integer>> arr) {
    // Write your code here
    int firstDiagonal = 0;
    int secondDiagonal = 0;

    int j = arr.size() - 1;
    for (int i = 0; i < arr.size(); i++) {
      firstDiagonal += arr.get(i).get(i);
      secondDiagonal += arr.get(i).get(j);
      j--;
    }

    return Math.abs(firstDiagonal - secondDiagonal);
  }

  public static void main(final String[] args) throws IOException {
    final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    final int n = Integer.parseInt(bufferedReader.readLine().trim());

    final List<List<Integer>> arr = new ArrayList<>();

    IntStream.range(0, n).forEach(i -> {
      try {
        arr.add(
          Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList())
        );
      } catch (final IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    final int result = diagonalDifference(arr);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }

}
