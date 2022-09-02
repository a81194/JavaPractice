public class Pyramid {

  public static void pyramid(int n){
    String stars="";
    for (int i=0;i<n;i++){
      stars+="*";
      System.out.println(stars);
    }
  }
  public static void main(String[] args) {
    pyramid(1);
    System.out.println("====================");
    pyramid(3);
    System.out.println("====================");
    pyramid(5);
  }
}
