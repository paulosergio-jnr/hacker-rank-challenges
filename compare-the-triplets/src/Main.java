import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

  private static List<Integer> compareTriplets(final List<Integer> a, final List<Integer> b) {
    // Write your code here
    int aliceScore = 0;
    int bobScore = 0;

    for (int i = 0; i < a.size(); i++) {
      aliceScore += (a.get(i) > b.get(i)) ? 1 : 0;
      bobScore += (a.get(i) < b.get(i)) ? 1 : 0;
    }

    final ArrayList<Integer> list = new ArrayList<>(2);
    list.add(aliceScore);
    list.add(bobScore);
    return list;
  }

  public static void main(final String[] args) throws IOException {
    final List<Integer> aliceList = Stream.of(17, 28, 30).collect(Collectors.toList());
    final List<Integer> bobList = Stream.of(99, 16, 8).collect(Collectors.toList());
    System.out.println(compareTriplets(aliceList, bobList));

//    final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//    final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//    final List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//      .map(Integer::parseInt)
//      .collect(toList());
//
//    final List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//      .map(Integer::parseInt)
//      .collect(toList());
//
//    final List<Integer> result = compareTriplets(a, b);
//
//    bufferedWriter.write(
//      result.stream()
//        .map(Object::toString)
//        .collect(joining(" "))
//        + "\n"
//    );
//
//    bufferedReader.close();
//    bufferedWriter.close();
  }

}
