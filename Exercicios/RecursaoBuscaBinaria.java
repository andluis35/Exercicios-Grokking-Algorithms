package recursaobuscabinaria;

/**
 * @author Anderson Luis
 */

public class RecursaoBuscaBinaria {

    public static void main(String[] args) {
        int[] array = {2,4,6,8,10,14,19};
        System.out.println(binarySearch(array, 0, array.length-1, 9));
    }
    
    public static boolean binarySearch(int[] array, int start, int end, int x) {
        int middle = (start + end) / 2;
        if(start > end) {
            return false;
        }
        else {
            if(array[middle] == x) {
                return true;
            }
            else {
                if(array[middle] > x) {
                    end = middle - 1;
                }
                else {
                    start = middle + 1;
                }
                return binarySearch(array, start, end, x);
            }
        }
    }
    
}
