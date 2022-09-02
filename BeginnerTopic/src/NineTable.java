public class NineTable {

  public static void nineTable(){
    for (int i=1;i<10;i++){
      for (int j=1;j<10;j++){
        System.out.println(i+" * "+j+" = "+(i*j));
      }
    }
  }
  public static void main(String[] args) {
    nineTable();
  }
}
