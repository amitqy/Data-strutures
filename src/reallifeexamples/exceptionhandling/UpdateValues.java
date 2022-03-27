package reallifeexamples.exceptionhandling;

import java.util.Arrays;

/**
 * Real life example of how can we use try, catch blocks to gracefully handle failures
 * Updating values case can be anything, say you are updating delivery status of all the items
 * in the db, at some time daily using a cron job
 */
public class UpdateValues {
    public static void main(String[] args) {
        int[] arr = new int[20];
        System.out.println(Arrays.toString(arr));
        /** if update fails for some index, except that index every value is updated **/
        updateValuesWithErrorHandling(1,arr);
        System.out.println(Arrays.toString(arr));
        /** if update fails for some index, program ends abruptly **/
        updateValuesWithNoErrorHandling(1,arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void updateValuesWithErrorHandling(int newValue, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            try {
                // simulating error here
                if(i == 15){
                    throw new RuntimeException();
                }
                arr[i] = newValue;
            }
            catch (Exception e){
                System.out.println("Some error occurred while updating " +  i  + "th index");
                System.out.println("Writing some default value there...");
                arr[i] = 3;
            }
        }
    }

    private static void updateValuesWithNoErrorHandling(int newValue, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i == 19){
                throw new RuntimeException("some error occurred at 19th index");
            }
            arr[i] = newValue;
        }
    }
}
