package recursaocontaritenslista;

/**
 * @author Anderson Luis
 */

public class RecursaoContarItensLista {

    public static void main(String[] args) {
        int[] array = {2,4,6};
        System.out.println(countItems(array, array.length));
    }
    
    public static int countItems(int[] array, int numberOfElements) {
        if(numberOfElements == 1) {
            return 1;
        }
        else {
            return 1 + countItems(array, numberOfElements - 1);
        }
    }
    
}
