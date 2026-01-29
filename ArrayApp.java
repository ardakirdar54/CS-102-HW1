import java.util.Random;

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

    // Taken an array size from the user, create an int array that contains random integers in the range [0,100]. 
    public static int[] CreateRandomArray(int size){
        Random random=new Random();
        int[] RandomArray=new int[size];
        for(int i=0;i<size;i++){
            RandomArray[i]=random.nextInt(101);
        }
        return RandomArray;
    }

}
