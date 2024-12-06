package recursaosomadeumalista;

/**
 * @author Anderson Luis
 */

public class RecursaoSomaDeUmaLista {

    public static void main(String[] args) {
        int[] array = {2,4,6};
        System.out.println(sumArray(array, array.length));
    }
    
    public static int sumArray(int[] array, int numberOfElements) {
        if(numberOfElements == 1) {
            return array[0];
        }
        else {
            return array[numberOfElements - 1] + sumArray(array, numberOfElements - 1);
        }
    }
    
}
