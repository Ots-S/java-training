public class MatrixTraining {

    /**
     * @param lines   height of the matrix, eg: 3
     * @param columns width of the matrix, eg: 2
     * @return an empty int matrix of lines and columns size, eg: {{0, 0}, {0, 0},
     *         {0, 0}}
     */
    public int[][] emptyIntMatrix(int lines, int columns) {
        int[][] result = new int[lines][columns];
        return result;
    }

    /**
     * @param lines   height of the matrix, eg: 2
     * @param columns width of the matrix, eg: 3
     * @return an empty string matrix of lines and columns size, eg: {{null, null,
     *         null}, {null, null, null}}
     */
    public String[][] emptyStringMatrix(int lines, int columns) {
        String[][] result = new String[lines][columns];
        return result;
    }

    /**
     * @param a first array
     * @param b second array
     * @param c third array
     * @return an int matrix with a, b and c arrays
     */
    public int[][] intMatrix(int[] a, int[] b, int[] c) {
        int[][] result = { a, b, c };
        return result;
    }

    /**
     * @param a first array
     * @param b second array
     * @param c third array
     * @return a String matrix with a, b and c arrays
     */
    public String[][] stringMatrix(String[] a, String[] b, String[] c) {
        String[][] result = { a, b, c };
        return result;
    }

    /**
     * @param matrix, eg: {{3, 4}, {6, 7}, {5, 8}}
     * @return number of matrix lines, eg: 3
     */
    public int height(int[][] matrix) {
        int[][] result = matrix;
        return result.length;
    }

    /**
     * @param matrix, eg: {{3, 4}, {6, 7}, {5, 8}}
     * @return number of matrix columns, eg: 2
     */
    public int width(int[][] matrix) {
        int[][] result = matrix;
        return result[0].length;
    }

    /**
     * @param matrix, eg: {{3, 4, 5}, {6, 7, 8}}
     * @param line,   eg: 1
     * @param column, eg: 0
     * @return value in matrix at line and column, eg: 6
     */
    public int valueAtPosition(int[][] matrix, int line, int column) {
        int[][] result = matrix;
        return result[line][column];
    }

    /**
     * @param matrix, eg: {{1, 2, 3}, {8, 5, 6}}
     * @param value,  eg: 4
     * @param line,   eg: 1
     * @param column, eg: 0
     * @return the matrix with the value replaced at line and column, eg: {{1, 2,
     *         3}, {4, 5, 6}}
     */
    public int[][] replace(int[][] matrix, int value, int line, int column) {
        int[][] result = matrix;
        result[line][column] = value;
        return result;
    }

    /**
     * @param matrix, eg: {{1, 2, 3}, {4, 5, 6}}
     * @return sum of matrix values, eg: 21
     */
    public int sum(int[][] matrix) {
        int[][] result = matrix;
        int total = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                total = total + result[i][j];
            }
        }
        return total;
    }

    /**
     * @param matrix, eg: {{1, 2, 3}, {4, 5, 6}}
     * @param search, eg: 5
     * @return if matrix contains searched value, eg: true
     */
    public boolean contains(int[][] matrix, int search) {
        int[][] result = matrix;

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (result[i][j] == search) {
                    return true;
                }

            }
        }
        return false;

    }

    /**
     * @param matrix, eg: {{1, 2, 3}, {4, 5, 6}}
     * @return how many even numbers are in matrix, eg: 3
     */
    public int countEvens(int[][] matrix) {
        int[][] result = matrix;
        
        int counter = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (result[i][j] % 2 == 0) {
                    counter++;
                }

            }
        }
        return counter;
    }

    /**
     * @param matrix, eg: {{'d', 'b', 'a'}, {'a', 'd', 'a'}}
     * @param search, eg: 'a'
     * @return the number of character occurrences in matrix, eg: 3
     */
    public int occurrences(char[][] matrix, char search) {
        char[][] result = matrix;
        int counter = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (result[i][j] == search) {
                    counter++;
                }

            }
        }
        return counter;
    }
}
