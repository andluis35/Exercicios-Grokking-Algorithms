package recursaofatorial;

/**
 * @author Anderson Luis
 */

public class RecursaoFatorial {

    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }
    
    public static int fatorial(int n) {
        if(n == 1) {
            return 1;
        }
        else {
            return n * fatorial(n-1);
        }
    }
    
}
