
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        boolean isValidChoice = false;
        boolean isFinished = false;
        int option = 0; // by default, invalid choice number. 
        Scanner input = new Scanner(System.in);
        System.out.print("Give the array size: ");
        int size = input.nextInt();
        int [] arr = ArrayApp.createRandomArray(size);
        
        while(!isFinished){
            System.out.println("Welcome to the Array App");
            System.out.println("""
                1-Find the array's minimum and maximum
                2-Find the average of the array
                3-Find the sum of elements with odd- and even-numbered indexes
                4-Exit from app
            """);
            
            while(!isValidChoice){
                System.out.print("Select your choice: ");
                if(!input.hasNextInt()){
                    option = input.nextInt();
                    if(option == 1 || option == 2 || option == 3 || option == 4){
                        System.out.print("Valid choice");
                        isValidChoice = true;
                    } else {
                        System.out.print("Invalid choice");
                    }
                } else {
                    System.out.print("Choose a valid number");
                }
            }

            if (option == 1){
                System.out.println("Maximum of Array: " + ArrayApp.findMax(arr));
                System.out.println("Minimum of Array: " + ArrayApp.findMin(arr));
            } else if (option == 2){
                System.out.println("Differs from average of Array: " + Arrays.toString(ArrayApp.differenceFromAverage(arr)));
            } else if (option == 3){
                System.out.println("Find the sum of elements with odd indexes: " + ArrayApp.findSumOfOddNumberedIndexes(arr));
                System.out.println("Find the sum of elements with even indexes: " + ArrayApp.findSumOfEvenNumberedIndexes(arr));
            } else{
                System.out.print("Exiting");
                isFinished = true;
            }


        }
    }
}
