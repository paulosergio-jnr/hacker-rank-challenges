public class Main {

  public static long repeatedString(String s, long n) {
    int stringSize = s.length();
    String infiniteString = "";
    long repetitions = 0;

    while (infiniteString.length() < n) {
      infiniteString = infiniteString + s;
    }

    for (int i = 0; i < n; i++){
      if (infiniteString.substring(i, i + stringSize).equals(s)) repetitions++;
    }

    return repetitions;
  }

  public static void main(String[] args) {
    System.err.println(repeatedString("abcac", 10) == 4);
  }

}
