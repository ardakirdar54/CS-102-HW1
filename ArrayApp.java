public class ArrayApp {
    public static void main(String[] args) {
        
    }
    
    /**
     * Finds the maximum value in an integer array.
     * @param arr the input array
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
     * @param arr the input array
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

    /**
     * Finds the sum of odd-numbered indexes in the array
     * @param arr the input array
     * @return sum of odd-numbered indexes in the array
     */
    public int findSumOfOddNumberedIndexes(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * Finds the sum of odd-numbered indexes in the array
     * @param arr the input array
     * @return sum of odd-numbered indexes in the array
     */
    public int findSumOfEvenNumberedIndexes(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }
}
