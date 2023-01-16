import java.util.Arrays;
import java.util.Random;

    public class gfg {
        public static void main(String[] args) {
            Random rand = new Random();
            int[] arr = new int[10];

            // Generate an array of random numbers
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(100);
            }

            // Create a new array with numbers divisible by 5
            int divisibleCount = 0;
            for (int num : arr) {
                if (num % 5 == 0) {
                    divisibleCount++;
                }
            }
            int[] divisibleArr = new int[divisibleCount];
            int j = 0;
            for (int num : arr) {
                if (num % 5 == 0) {
                    divisibleArr[j] = num;
                    j++;
                }
            }

            // Sort the new array in increasing order
            Arrays.sort(divisibleArr);

            // Print the new array
            System.out.println(Arrays.toString(divisibleArr));
        }
    }


