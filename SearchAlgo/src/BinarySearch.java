public class BinarySearch {
    public static void binarySearch(int[] numbers,int n){
        int min=0;
        int max=numbers.length-1;
        int step=0;
        while (min<=max){
            step++;
            int middle=(min+max)/2;
            if (n>numbers[middle]){
                min=middle+1;
            } else if (n<numbers[middle]) {
                max=middle-1;
            }else {
                System.out.println(n+" is found, its index is "+middle+" and found it spend "+step+" steps");
                return;
            }
        }
        System.out.println("Can't find "+n);
    };
    public static void main(String[] args) {
        int[] numbers = {9, 12, 15, 18, 19, 20, 22, 25, 26, 26, 33, 37, 38, 41, 47, 47, 50, 55, 57, 60,
                68, 80, 87, 90, 98, 100, 103, 108, 109, 109, 116, 120, 120, 124, 127, 128,
                131, 135, 135, 139, 143, 145, 151, 155, 156, 158, 163, 164, 165, 169, 169,
                173, 174, 176, 177, 178, 181, 182, 182, 183, 184, 189, 192, 195, 200, 201,
                203, 204, 207, 213, 217, 222, 222, 222, 227, 228, 233, 235, 237, 239, 239,
                243, 248, 251, 252, 257, 260, 260, 263, 268, 270, 271, 271, 276, 281, 284,
                285, 295, 297, 298};
        binarySearch(numbers,20);
        binarySearch(numbers,14);
        binarySearch(numbers,298);
    }
}
