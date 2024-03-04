package lab1;
public class ex2 {
    public static void main(String[] args) {

        int[][] matrix1 = {{2, 3, 1}, {7, 1, 6}, {9, 2, 4}};

        int[][] matrix2 = {{8, 5, 3}, {3, 9, 2}, {2, 7, 3}};

        int[][] sumMatrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Sum of the matrices:");
        displayMatrix(sumMatrix);


        int[][] productMatrix = new int[3][3];
        for (int i = 0; i < 3; i++) {           // i is rows of the 1st matrix
            for (int j = 0; j < 3; j++) {       // j is columns of the 2nd matrix
                for (int k = 0; k < 3; k++) {   // k is used for iteration of the matrixes
                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Product of the matrices:");
        displayMatrix(productMatrix);
    }


    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}