package quicksort;

import java.util.Random;

/**
 * @author Anderson Luis
 */

public class QuickSort {

    public static void main(String[] args) {
        Random randomNumber = new Random();
        int[] array = new int[10];
        
        for(int i = 0; i < array.length; i++) {
            array[i] = randomNumber.nextInt(100);
        }
        
        System.out.print("ANTES: ");
        printArray(array);
        
        quickSort(array, 0, array.length-1);
        
        System.out.print("DEPOIS: ");
        printArray(array);
    }
    
    public static void quickSort(int[] array, int start, int end) {
        int pivotIndex;
        int pivot;
        int leftPointer;
        
        if(start >= end) {
            return;
        }
        else {
            pivotIndex = new Random().nextInt(end - start) + start;
            pivot = array[pivotIndex];
            swap(array, pivotIndex, end);
            
            leftPointer = partition(array, start, end, pivot);
            
            quickSort(array, start, leftPointer - 1);
            quickSort(array, leftPointer + 1, end);
        }
    }
    
    public static int partition(int[] array, int start, int end, int pivot) {
        int leftPointer = start;
        int rightPointer = end;
            
        while(leftPointer < rightPointer) {
            while(array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
                
            while(array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
                
            swap(array, leftPointer, rightPointer);
        }
            
        swap(array, leftPointer, end);
        return leftPointer;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void printArray(int[] array) {
        for(int value: array) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }
    
}
