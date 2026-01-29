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

    /**
     * Finds the difference of all elements from average of elements
     * @param arr
     * @return Difference of all elements from average
     */
    public int[] differenceFromAverage(int[] arr) {
        int average = 0;
        for(int i = 0; i < arr.length; i++){
            average += arr[i];
        }
        average /= arr.length;

        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] - average;
        }

        return arr;
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
