public class ConfirmEnding {

  public static boolean confirmEnding(String str1, String str2) {
    int i = str2.length() - 1;
    int j = str1.length() - 1;
    while (i > -1) {
      if (str2.charAt(i) == str1.charAt(j)) {
        i--;
        j--;
      } else {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(confirmEnding("Bastian", "n"));
    System.out.println(confirmEnding("Connor", "n"));
    System.out.println(confirmEnding("Open sesame", "same"));
  }
}
