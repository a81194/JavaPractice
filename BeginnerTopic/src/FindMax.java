public class FindMax {

  public static int findMax(int[] arr){
    int max=0;
    for(int i=0;i<arr.length-1;i++){
      max=arr[i];
      if (max<arr[i+1]){
        max=arr[i+1];
      }else {

      }
    }
    return max;
  }
  public static void main(String[] args) {
    int[] array = {4, 3, 6, 7, 9, 10, 33, 0, -4, 12, 400, 133, 324, 1234231, 12334};
    System.out.println(findMax(array));
  }
}
