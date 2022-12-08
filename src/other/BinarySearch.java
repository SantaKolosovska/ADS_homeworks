package other;

public class BinarySearch {

    public static boolean binarySearchRecursive(int[] array, int x, int left, int right) {
        if (left > right) {
            return false;
        }

        int mid = (left + right) / 2;     // int mid = left + ((right - left) / 2);
        if (array[mid] == x) {
            return true;
        } else if (x < array[mid]) {
            return binarySearchRecursive(array, x, left, mid - 1);
        } else {
            return binarySearchRecursive(array, x, mid + 1, right);
        }
    }

    public static boolean binarySearchIterative(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == x) {
                return true;
            } else if (x < array[mid]) {
                return binarySearchRecursive(array, x, left, mid - 1);
            } else {
                return binarySearchRecursive(array, x, mid + 1, right);
            }
        }
        return false;
    }

    public static boolean binarySearchRecursive(int[] array, int x) {
        return binarySearchRecursive(array, x, 0, array.length - 1);
    }


    public static void main(String[] args) {
        int[] array = new int[9];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;


        System.out.println(binarySearchRecursive(array, 11));
        System.out.println(binarySearchRecursive(array, 2));

        System.out.println("");

        System.out.println(binarySearchIterative(array, 11));
        System.out.println(binarySearchIterative(array, 5));
    }
}
