package ADS.hw2;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShellSortImplementation {

    // my implementation
    public static int[] myShellSort(int[] arrayToSort) {
        int initialGap = arrayToSort.length / 2;

        for (int gap = initialGap; gap > 0; gap = gap / 2) {
            for (int index = gap; index < arrayToSort.length; index++) {
                while (arrayToSort[index] < arrayToSort[index - gap]) {
                    int temp = arrayToSort[index - gap];
                    arrayToSort[index - gap] = arrayToSort[index];
                    arrayToSort[index] = temp;
                    if (index - gap >= gap) {
                        index = index - gap;
                    }
                }
            }
        }

        return arrayToSort;
    }

    public static int[] createShuffledArray(int size) {
        List<Integer> integerList = IntStream.rangeClosed(1, size).boxed().collect(Collectors.toList());
        Collections.shuffle(integerList);

        int[] intArray = new int[size];
        for (int i = 0; i < integerList.size(); i++) {
            intArray[i] = integerList.get(i);
        }

        return intArray;
    }

    public static void printArray(int[] array) {
        String arrayString = "";
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                arrayString = arrayString + array[i] + ", ";
            } else {
                arrayString = arrayString + array[i];
            }

        }
        System.out.println(arrayString);
    }

    // not mine
    public static int[] sort(int arrayToSort[]) {
        int n = arrayToSort.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = arrayToSort[i];
                int j = i;
                while (j >= gap && arrayToSort[j - gap] > key) {
                    arrayToSort[j] = arrayToSort[j - gap];
                    j -= gap;
                }
                arrayToSort[j] = key;
            }
        }
        return arrayToSort;
    }

    // not mine
    public static int[] sort2(int arrayToSort[]) {
        int n = arrayToSort.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = arrayToSort[i];
//                int j = i;
                while (i >= gap && arrayToSort[i - gap] > key) {
                    arrayToSort[i] = arrayToSort[i - gap];
                    i -= gap;
                }
                arrayToSort[i] = key;
            }
        }
        return arrayToSort;
    }

    // not mine
    public static int[] shell(int[] a) {
        int increment = a.length / 2;
        while (increment > 0) {
            for (int i = increment; i < a.length; i++) {
                int j = i;
                int temp = a[i];
                while (j >= increment && a[j - increment] > temp) {
                    a[j] = a[j - increment];
                    j = j - increment;
                }
                a[j] = temp;
            }
            if (increment == 2) {
                increment = 1;
            } else {
                increment *= (5.0 / 11);
            }
        }
        return a;
    }

}
