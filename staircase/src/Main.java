import java.time.LocalDate;

public class Main {

  public static void main(final String[] args) {
    int size = 6;

    for(int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.print((j < (size - i - 1)) ? " " : "#");
      }
        System.out.println("");
    }

  }

}
