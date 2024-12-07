package quicksort;

import java.util.ArrayList;

/**
 * @author Anderson Luis
 */

public class QuickSort {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(7);
        array.add(5);
        array.add(2);
        array.add(6);
        array.add(11);
        array.add(10);
        array.add(12);
        
        array = quickSort(array);
        
        System.out.println("----" + array.size() + "-----");
        
        for(int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
    }
    
    public static ArrayList<Integer> quickSort(ArrayList<Integer> array) {
        ArrayList<Integer> leftSide = new ArrayList<Integer>();
        ArrayList<Integer> rightSide = new ArrayList<Integer>();
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        
        int pivot;
        int element;
        
        if(array.size() < 2) {
            return array;
        }
        else {
            pivot = array.get(0);

            for(int i = 0; i < array.size(); i++) {
                element = array.get(i);
                if(element < pivot) {
                    leftSide.add(element);
                }
                else {
                    rightSide.add(element);
                }
            }
            
            leftSide = quickSort(leftSide);
            //rightSide = quickSort(rightSide);
            
            newArray.addAll(leftSide);
            newArray.addAll(rightSide);
            
            return newArray;
        }
    }
    
}
