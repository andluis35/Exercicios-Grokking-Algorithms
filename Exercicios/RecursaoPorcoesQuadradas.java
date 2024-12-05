package recursaoporcoesquadradas;

/**
 * @author Anderson Luis
 */

public class RecursaoPorcoesQuadradas {

    public static void main(String[] args) {
        float biggestSquare = divideIntoSquares(1680, 640);
        System.out.println("MAIOR QUADRADO POSSÍVEL: " + biggestSquare + " x " + biggestSquare);
    }
    
    public static float divideIntoSquares(float width, float height) {
        float newWidth;
        float newHeight;
        
        if(width % height == 0 || height % width == 0) {
            return defineSmallest(width, height);
        }
        else {
            if(width > height) {
                newWidth = width % height;
                return divideIntoSquares(newWidth, height);
            }
            else {
                newHeight = height % width;
                return divideIntoSquares(width, newHeight);
            }
        }
    }
    
    public static float defineSmallest(float width, float height) {
        if(width > height) {
            return height;
        }
        else {
            return width;
        }
    }
    
}
