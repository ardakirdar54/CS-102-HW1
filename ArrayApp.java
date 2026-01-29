public class ArrayApp {
    public static void main(String[] args) {
        
    }
    
    /**
     * Finds the maximum value in an integer array.
     * @param arr
     * @return maximum value in the array
     */
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Finds the minimum value in an integer array.
     * @param arr
     * @return minimum value in the array
     */
    public int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public int[] differenceToAverage(int[] arr) {
        // TO DO: Implement this method
        return null;
    }

    public int findSumOfOddNumberedIndexes(int[] arr) {
        // TO DO: Implement this method
        return 0;
    }

    public int findSumOfEvenNumberedIndexes(int[] arr) {
        // TO DO: Implement this method
        return 0;
    }
}
