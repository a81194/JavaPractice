public class AddUpTo {

  public static int addUpTo(int n){
    int reslut=(1+n)*n/2;
    return reslut;
  }
  public static void main(String[] args) {
    System.out.println(addUpTo(10));
    System.out.println(addUpTo(100));
    System.out.println(addUpTo(1000));
    System.out.println(addUpTo(10000));
  }
}
