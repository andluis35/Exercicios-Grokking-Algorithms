package recursaomaiorvalordalista;

/**
 * @author Anderson Luis
 */

public class RecursaoMaiorValorDaLista {

    public static void main(String[] args) {
        int[] array = {2,4,3};
        System.out.println(foundBiggestValue(array, array.length));
    }
    
    public static int foundBiggestValue(int[] array, int numberOfElements) {
        int max;
        if(numberOfElements == 2) {
            return defineBiggest(array[0], array[1]);
        }
        else {
            max = foundBiggestValue(array, numberOfElements - 1);
            return defineBiggest(array[numberOfElements - 1], max);
        }
    }
    
    public static int defineBiggest(int n1, int n2) {
        if(n1 > n2) {
            return n1;
        }
        else {
            return n2;
        }
    }
    
}
