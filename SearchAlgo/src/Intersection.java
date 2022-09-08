import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//public class Intersection {
//    public static Set<Integer> getIds(Integer[] a1,Integer[] a2){
//        Set<Integer> temp=new HashSet<Integer>();
//        Set<Integer> same=new HashSet<Integer>();
//        for (int i=0;i< a1.length;i++){
//            temp.add(a1[i]);
//        }
//        for (int j=0;j< a2.length;j++){
//            if (!temp.add(a2[j]))
//                same.add(a2[j]);
//        }
//        return same;
//    }
//
//    public static void main(String[] args) {
//        Integer[] a1 = {1,2,3,2,1};
//        Integer[] a2 = {1,2,3};
//        Integer[] a3 = {1,2,3,4};
//
//        Set<Integer> sameElementSet=getIds(a1,a2);
//
//        for (int i:sameElementSet){
//            System.out.println(i);
//        }
//
//    }
//}


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Intersection {
    public static void intersection(int[] arr1, int[] arr2) {

        // O(n)
        ArrayList<Integer> result=new ArrayList<>();
        int[] arr3=new int[arr1.length+arr2.length];
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
        Map<Integer, Integer> counter=new HashMap<>();
        for (int i=0;i< arr3.length;i++){
            if (!counter.containsKey(arr3[i])){
                counter.put(arr3[i],1);
            }else {
                counter.replace(arr3[i],2);
            }
        }
        System.out.println(counter);
        int length=counter.toString().length();
        String[] str=counter.toString().substring(1,length-1).split(",");
        for (int i=0;i<str.length;i++){
            if(str[i].charAt(str[i].length()-1)=='2'){
                String num= str[i].substring(0, str[i].lastIndexOf("="));
                System.out.print(num+" ");
            }
        }



        // O(n^2)
//        ArrayList<Integer> result = new ArrayList<>();
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length ; j++) {
//                if (arr1[i] == arr2[j]) {
//                    result.add(arr1[i]);
//                }
//            }
//        }
//        System.out.println(result);
    }

    public static void main(String[] args) {

        long startTime=System.currentTimeMillis();

        int[] arr1 = {9, 12, 15, 18, 19, 20, 22, 25, 26, 26, 33, 37, 38, 41, 47, 47, 50, 55, 57, 60,
                68, 80, 87, 90, 98, 100, 103, 108, 109, 109, 116, 120, 120, 124, 127, 128,
                131, 135, 135, 139, 143, 145, 151, 155, 156, 158, 163, 164, 165, 169, 169,
                173, 174, 176, 177, 178, 181, 182, 182, 183, 184, 189, 192, 195, 200, 201,
                203, 204, 207, 213, 217, 222, 222, 222, 227, 228, 233, 235, 237, 239, 239,
                243, 248, 251, 252, 257, 260, 260, 263, 268, 270, 271, 271, 276, 281, 284,
                285, 295, 297, 298};
        int[] arr2 = {19, 5, 16, 10, 3, 1};
        intersection(arr1, arr2);

        long endTime=System.currentTimeMillis();
        System.out.println("程式執行時間："+(endTime-startTime)+" ms.");
    }
}
