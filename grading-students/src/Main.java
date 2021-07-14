import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main {

  private static List<Integer> gradingStudents(final List<Integer> grades) {
    for (int i = 0; i < grades.size(); i++) {
      Integer grade = grades.get(i);

      if (grade < 38) {
        continue;
      }

      int count = 0;

      while ((grade + count) % 5 != 0 && count < 3) {
        count++;
      }

      if (count < 3) {
        grade += count;
      }

      grades.set(i, grade);
    }

    return grades;
  }

  private static List<Integer> secondSolution(final List<Integer> grades) {
    for (int i = 0; i < grades.size(); i++) {
      Integer grade = grades.get(i);

      if (grade >= 38) {
        int mod5 = grade % 5;

        if (mod5 > 2) {
          grade += 5 - mod5;
        }

      }

      grades.set(i, grade);
    }

    return grades;
  }

  public static void main(final String[] args) throws IOException {
    final List<Integer> grades = Stream.of(73, 67, 38, 33)
      .collect(toList());

    final List<Integer> result = secondSolution(grades);

    System.out.println(
      result.stream()
        .map(Object::toString)
        .collect(joining("\n"))
        + "\n"
    );
  }

}
