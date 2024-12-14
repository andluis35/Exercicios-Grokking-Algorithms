package selectionsort;

import java.util.ArrayList;

/**
 * @author Anderson Luis
 */

public class SelectionSort {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(2);
        array.add(3);
        array.add(1);
        array.add(4);
        array.add(5);
        
        System.out.println("-------------------------");
        
        for(int value : array) {
            System.out.print("[" + value + "]" + " ");
        }
        
        System.out.println("\n-------------------------");
        
        array = selectionSort(array);
        
        for(int value : array) {
            System.out.print("[" + value + "]" + " ");
        }
        
        System.out.println("\n-------------------------");
    }
    
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> array) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int minorIndex;
        int element;
        int totalOfElements = array.size();
        
        for(int i = 0; i < totalOfElements; i++) {
            minorIndex = searchForMinor(array);
            element = array.remove(minorIndex);
            newArray.add(element);
        }

        return newArray;
    }
    
    public static int searchForMinor(ArrayList<Integer> array) {
        int minorIndex = 0;
        
        for(int i = 0; i < array.size(); i++) {
            if(array.get(i) < array.get(minorIndex)) {
                minorIndex = i;
            }
        }
        return minorIndex;
    }
    
}
