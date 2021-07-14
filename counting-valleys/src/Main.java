import java.io.IOException;

public class Main {

  private static int countingValleys(final int steps, final String path) {
    // Write your code here

    int currentLevel = 0;
    int valleys = 0;

    for (int i = 0; i < steps; i++) {
      if (path.charAt(i) == 'D') {
        currentLevel--;
      } else {
        currentLevel++;
        if (currentLevel == 0) {
          valleys++;
        }
      }
    }

    return valleys;
  }

  public static void main(final String[] args) throws IOException {
    final String path = "UDDDUDUU";

    final int result = countingValleys(path.length(), path);

    System.out.println(result);
  }

}
