package dynamic_array;

import java.util.Arrays;

public class Main {
    static int[] arr = new int[5];
    static int currIndex = 0;
    static int size = 0;
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            insertInArray((int)(Math.random()*100));
        }
    }
    private static void insertInArray(int element) {

        if(size > arr.length-1){
            System.out.println("array is full ");
            System.out.println(Arrays.toString(arr));
            int[] newArray = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                newArray[i] = arr[i];
            }
            arr = newArray;
        }
        else{

            arr[currIndex] = element;
            currIndex++;
            size++;
        }
    }
}
