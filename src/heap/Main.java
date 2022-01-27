package heap;

import java.util.Arrays;

public class Main {
    static int[] arr = {2,44,8,27,66,636,81,1};
    static int heapSize = arr.length;
    public static void main(String[] args) {
        for (int i = (heapSize/2)-1; i >=0 ; i--) {
             maxHeapify(arr,i,heapSize);
        }
        System.out.println("After max heapify");
        System.out.println(Arrays.toString(arr));
        System.out.println("Element polled: " + poll(arr));
        System.out.println("Array after polling: ");
        for (int i = 0; i < heapSize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Element polled: " + peek(arr));
        System.out.println("Array after peek: ");
        for (int i = 0; i < heapSize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int initialHeapSize = heapSize;
        /** calling poll on heap 'heapSize' times can be thought of as heapSort -> O(nlog(n)) **/
        System.out.println("Sorted array: ");
        for (int i = 0; i < initialHeapSize; i++) {
            System.out.print(poll(arr) + " ");
        }
        // reset the heapSize
        heapSize = initialHeapSize;
    }

    private static int poll(int[] arr) {
        int maxElement = arr[0];
        int temp = arr[0];
        arr[0] = arr[heapSize-1];
        arr[heapSize-1] = temp;
        heapSize = heapSize-1;
        maxHeapify(arr,0,heapSize);
        return maxElement;
    }

    private static int peek(int[] arr) {
        int maxElement = arr[0];
        int temp = arr[0];
        arr[0] = arr[heapSize-1];
        arr[heapSize-1] = temp;
        maxHeapify(arr,0,heapSize);
        return maxElement;
    }

    private static void maxHeapify(int[] arr, int i, int n) {
        int leftIndex = 2*i+1;
        int rightIndex = 2*i+2;
        int maxIndex = i;
        if(leftIndex <= n-1 && arr[leftIndex] > arr[maxIndex]){
            maxIndex = leftIndex;
        }
        if(rightIndex <= n-1 && arr[rightIndex] > arr[maxIndex]){
            maxIndex = rightIndex;
        }

        if(maxIndex != i){
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
            maxHeapify(arr,maxIndex,n);
        }
    }
}
