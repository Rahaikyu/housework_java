package hw1_9;

public class hw6 {
    public static void minToBegin(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        if (minIndex == 0) {
            return;
        }

        int minValue = arr[minIndex];

        for (int i = minIndex; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = minValue;
    }

}
