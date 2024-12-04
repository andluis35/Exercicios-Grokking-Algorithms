package buscabinaria;

public class BuscaBinaria {

    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        System.out.println(binarySearch(list, 3));
    }
    
    public static int binarySearch(int[] list, int x) {
        int start = 0;
        int end = list.length - 1;
        int middle;
        
        while(start <= end) {
            
            middle = (start+end) / 2;
            
            if(list[middle] == x) {
                return middle;
            }
            else {
                if(x > list[middle]) {
                    start = middle + 1;
                }
                else {
                    end = middle - 1;
                }
            }
        }
        
        return -1;
    }
    
}
