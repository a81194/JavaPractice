public class LinearSearch {
    public static void linearSearch(int[] numbers, int n){
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]==n) {
                System.out.println("Can find "+n+" ,index is "+i);
                return;
            }

        }
        System.out.println("Can't find "+n);
    }

    public static void main(String[] args) {

        int[] numbers = {33, 99, 97, 28, 87, 72, 48, 72, 18, 89, 18, 45, 85, 13, 70, 80, 10, 88, 92, 65, 23, 73, 88, 55, 1, 79, 95,
                69, 30, 31, 88, 13, 32, 86, 15, 51, 69, 29, 11, 26, 62, 0, 45, 32, 21, 4, 73, 10, 88, 23, 93, 34, 91, 68, 8, 36, 66,
                19, 45, 12, 15, 29, 68, 59, 53, 76, 42, 81, 27, 30, 69, 15, 18, 0, 12, 2, 28, 79, 49, 15, 70, 4, 34, 48, 40, 28, 55, 73, 18, 37, 10,
                65, 95, 11, 49, 7, 22, 24, 19, 33};
        linearSearch(numbers,5);
        linearSearch(numbers,33);
    }
}
