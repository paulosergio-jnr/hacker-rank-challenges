import java.io.IOException;

public class Main {

  private static String timeConversion(final String time) {
    // Write your code here
    String hour = time.substring(0, 2);

    if (time.charAt(8) == 'A' && hour.equals("12")) {
      hour = "00";
    }

    if (time.charAt(8) == 'P' && Integer.parseInt(hour) < 12) {
      hour = String.valueOf(Integer.parseInt(hour) + 12);
    }

    return hour + time.substring(2, time.length() - 2);
  }


  public static void main(final String[] args) throws IOException {
    final String time = "12:05:45PM";

    System.out.println(timeConversion(time));
  }

}
