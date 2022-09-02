import org.w3c.dom.ls.LSOutput;

public class Position {

  public static void position(String str) {
    String[] chars = str.split("");
    if (chars[0].equals("")) {
      System.out.println(-1);
    } else {
      for (int i = 0; i < chars.length; i++) {
        if (chars[i].equals(chars[i].toUpperCase())) {
          System.out.println(chars[i] + " " + i);
          return;
        } else {

        }
      }
      System.out.println(-1);
    }
  }

  public static void main(String[] args) {
    position("");
    position("abcd"); // prints -1
    position("AbcD"); // prints A 0
    position("abCD"); // prints C 2
  }
}
