package ADS.hw2;

public class Main {
    // class to test shellsort implementation
    public static void main(String[] args) {

        int sizeOfArray = 80000;

        int[] array1 = ShellSortImplementation.createShuffledArray(sizeOfArray);
        int[] array2 = ShellSortImplementation.createShuffledArray(sizeOfArray);
        int[] array3 = ShellSortImplementation.createShuffledArray(sizeOfArray);
        int[] array4 = ShellSortImplementation.createShuffledArray(sizeOfArray);
        int[] array5 = ShellSortImplementation.createShuffledArray(sizeOfArray);
        int[] array6 = ShellSortImplementation.createShuffledArray(sizeOfArray);
        int[] array7 = ShellSortImplementation.createShuffledArray(sizeOfArray);
        int[] array8 = ShellSortImplementation.createShuffledArray(sizeOfArray);
        int[] array9 = ShellSortImplementation.createShuffledArray(sizeOfArray);
        int[] array10 = ShellSortImplementation.createShuffledArray(sizeOfArray);
        int[] array11 = ShellSortImplementation.createShuffledArray(sizeOfArray);
        int[] array12 = ShellSortImplementation.createShuffledArray(sizeOfArray);
        int[] array13 = ShellSortImplementation.createShuffledArray(sizeOfArray);
        int[] array14 = ShellSortImplementation.createShuffledArray(sizeOfArray);

        // --- BIG ARRAYS (seconds) ---
        // first results ignored in average calculation because the first two to three always run
        // noticeably longer (twice as long) than the rest

        double time = 0;

        long start = System.nanoTime();
        ShellSortImplementation.myShellSort(array1);
        long end = System.nanoTime();
        System.out.println("1. Sorting time of array: " + (end - start)* 0.000000001);
//        time += (end - start)* 0.000000001;

        start = System.nanoTime();
        ShellSortImplementation.myShellSort(array2);
        end = System.nanoTime();
        System.out.println("2. Sorting time of array: " + (end - start)* 0.000000001);
//        time += (end - start)* 0.000000001;

        start = System.nanoTime();
        ShellSortImplementation.myShellSort(array3);
        end = System.nanoTime();
        System.out.println("3. Sorting time of array: " + (end - start)* 0.000000001);
//        time += (end - start)* 0.000000001;

        start = System.nanoTime();
        ShellSortImplementation.myShellSort(array4);
        end = System.nanoTime();
        System.out.println("4. Sorting time of array: " + (end - start)* 0.000000001);
        time += (end - start)* 0.000000001;

        start = System.nanoTime();
        ShellSortImplementation.myShellSort(array5);
        end = System.nanoTime();
        System.out.println("5. Sorting time of array: " + (end - start)* 0.000000001);
        time += (end - start)* 0.000000001;

        start = System.nanoTime();
        ShellSortImplementation.myShellSort(array6);
        end = System.nanoTime();
        System.out.println("6. Sorting time of array: " + (end - start)* 0.000000001);
        time += (end - start)* 0.000000001;

        start = System.nanoTime();
        ShellSortImplementation.myShellSort(array7);
        end = System.nanoTime();
        System.out.println("7. Sorting time of array: " + (end - start)* 0.000000001);
        time += (end - start)* 0.000000001;

        start = System.nanoTime();
        ShellSortImplementation.myShellSort(array8);
        end = System.nanoTime();
        System.out.println("8. Sorting time of array: " + (end - start)* 0.000000001);
        time += (end - start)* 0.000000001;

        start = System.nanoTime();
        ShellSortImplementation.myShellSort(array9);
        end = System.nanoTime();
        System.out.println("9. Sorting time of array: " + (end - start)* 0.000000001);
        time += (end - start)* 0.000000001;

        start = System.nanoTime();
        ShellSortImplementation.myShellSort(array10);
        end = System.nanoTime();
        System.out.println("10. Sorting time of array: " + (end - start)* 0.000000001);
        time += (end - start)* 0.000000001;

        start = System.nanoTime();
        ShellSortImplementation.myShellSort(array11);
        end = System.nanoTime();
        System.out.println("11. Sorting time of array: " + (end - start)* 0.000000001);
        time += (end - start)* 0.000000001;

        start = System.nanoTime();
        ShellSortImplementation.myShellSort(array12);
        end = System.nanoTime();
        System.out.println("12. Sorting time of array: " + (end - start)* 0.000000001);
        time += (end - start)* 0.000000001;

        start = System.nanoTime();
        ShellSortImplementation.myShellSort(array13);
        end = System.nanoTime();
        System.out.println("13. Sorting time of array: " + (end - start)* 0.000000001);
        time += (end - start)* 0.000000001;

        start = System.nanoTime();
        ShellSortImplementation.myShellSort(array14);
        end = System.nanoTime();
        System.out.println("14. Sorting time of array: " + (end - start)* 0.000000001);
        time += (end - start)* 0.000000001;

        System.out.println();
        System.out.println("Average running time: " + time/13);



        // --- SMALL ARRAYS (nanoseconds) ---
//
//        double time = 0;
//
//        long start = System.nanoTime();
//        ShellSortImplementation.mySort3(array1);
//        long end = System.nanoTime();
//        System.out.println("1. Sorting time of array: " + (end - start));
////        time += (end - start);
//
//        start = System.nanoTime();
//        ShellSortImplementation.mySort3(array2);
//        end = System.nanoTime();
//        System.out.println("2. Sorting time of array: " + (end - start));
////        time += (end - start);
//
//        start = System.nanoTime();
//        ShellSortImplementation.mySort3(array3);
//        end = System.nanoTime();
//        System.out.println("3. Sorting time of array: " + (end - start));
////        time += (end - start);
//
//        start = System.nanoTime();
//        ShellSortImplementation.mySort3(array4);
//        end = System.nanoTime();
//        System.out.println("4. Sorting time of array: " + (end - start));
////        time += (end - start);
//
//        start = System.nanoTime();
//        ShellSortImplementation.mySort3(array5);
//        end = System.nanoTime();
//        System.out.println("5. Sorting time of array: " + (end - start));
//        time += (end - start);
//
//        start = System.nanoTime();
//        ShellSortImplementation.mySort3(array6);
//        end = System.nanoTime();
//        System.out.println("6. Sorting time of array: " + (end - start));
//        time += (end - start);
//
//        start = System.nanoTime();
//        ShellSortImplementation.mySort3(array7);
//        end = System.nanoTime();
//        System.out.println("7. Sorting time of array: " + (end - start));
//        time += (end - start);
//
//        start = System.nanoTime();
//        ShellSortImplementation.mySort3(array8);
//        end = System.nanoTime();
//        System.out.println("8. Sorting time of array: " + (end - start));
//        time += (end - start);
//
//        start = System.nanoTime();
//        ShellSortImplementation.mySort3(array9);
//        end = System.nanoTime();
//        System.out.println("9. Sorting time of array: " + (end - start));
//        time += (end - start);
//
//        start = System.nanoTime();
//        ShellSortImplementation.mySort3(array10);
//        end = System.nanoTime();
//        System.out.println("10. Sorting time of array: " + (end - start));
//        time += (end - start);
//
//        start = System.nanoTime();
//        ShellSortImplementation.mySort3(array11);
//        end = System.nanoTime();
//        System.out.println("11. Sorting time of array: " + (end - start));
//        time += (end - start);
//
//        start = System.nanoTime();
//        ShellSortImplementation.mySort3(array12);
//        end = System.nanoTime();
//        System.out.println("12. Sorting time of array: " + (end - start));
//        time += (end - start);
//
//        start = System.nanoTime();
//        ShellSortImplementation.mySort3(array13);
//        end = System.nanoTime();
//        System.out.println("13. Sorting time of array: " + (end - start));
//        time += (end - start);
//
//        start = System.nanoTime();
//        ShellSortImplementation.mySort3(array14);
//        end = System.nanoTime();
//        System.out.println("14. Sorting time of array: " + (end - start));
//        time += (end - start);
//
//        System.out.println();
//        System.out.println("Average running time: " + time/10);

    }
}
