package other;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InsertionSort {

//     public static int[] sort(int[] arrayToSort) {
//         for (int i = 1; i < arrayToSort.length; i++) {
//             for (int j = i-1; j >= 0; j--) {
//                 if (arrayToSort[i] < arrayToSort[j]) {
//                     int temp = arrayToSort[j];
//                     arrayToSort[j] = arrayToSort[i];
//                     arrayToSort[i] = temp;
//                     i--;
//                 }
//             }
//         }
//
//         return arrayToSort;
//     }

    public static int[] sort2(int[] arrayToSort) {
        for (int i = 1; i < arrayToSort.length; i++) {
            int index = i;
            for (int j = index-1; j >= 0; j--) {
                if (arrayToSort[index] < arrayToSort[j]) {
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[index];
                    arrayToSort[index] = temp;
                    index--;
                }
            }
        }

        return arrayToSort;
    }

    public static void main(String[] args) {
         int[] intArray = createShuffledArray(7);
         printArray(intArray);

//        System.out.println();
//        int[] sortedArray = sort(intArray);
//        printArray(sortedArray);

        System.out.println();
        int[] sortedArray2 = sort2(intArray);
        printArray(sortedArray2);



    }

    public static int[] createShuffledArray(int size) {
        List<Integer> integerList = IntStream.rangeClosed(1, size).boxed().collect(Collectors.toList());
        Collections.shuffle(integerList);

        int[] intArray = new int[size];
        for (int i = 0; i< integerList.size(); i++) {
            intArray[i] = integerList.get(i);
        }

        return intArray;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }
}
