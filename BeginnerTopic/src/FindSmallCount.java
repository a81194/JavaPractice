public class FindSmallCount {

  public static int findSmallCount(int[] arr,int num){
    int count=0;
    for (int i=0;i<arr.length;i++){
      if(arr[i]<num){
        count++;
      }else {

      }
    }return count;
  }
  public static void main(String[] args) {
    System.out.println(findSmallCount(new int[] {1, 2, 3}, 2));
    System.out.println(findSmallCount(new int[] {1, 2, 3, 4, 5}, 0));
    System.out.println(findSmallCount(new int[] {7, 5, 1, 2, 3}, 5));
  }
}
