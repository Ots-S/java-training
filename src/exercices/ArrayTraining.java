public class ArrayTraining {

    /**
     * @param n size of the array, eg: 3
     * @return an empty int array of size n, eg: {0, 0, 0}
     */
    public int[] emptyIntArray(int n) {
        int[] result = new int[n];
        return result;
    }

    /**
     * @param n size of the array, eg: 2
     * @return an empty String array of size n, eg: {null, null}
     */
    public String[] emptyStringArray(int n) {
        String[] result = new String[n];
        return result;
    }

    /**
     * @param a first value, eg: 3
     * @param b second value, eg: 2
     * @param c third value, eg: 1
     * @return an int array with a, b and c values, eg: {3, 2, 1}
     */
    public int[] intArray(int a, int b, int c) {
        int[] result = { a, b, c };
        return result;
    }

    /**
     * @param a first value, eg: "test"
     * @param b second value, eg: "sample"
     * @param c third value, eg: "value"
     * @return an int array with a, b and c values, eg: {"test", sample", "value"}
     */
    public String[] stringArray(String a, String b, String c) {
        String[] result = { a, b, c };
        return result;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return length of the array, eg: 1
     */
    public int length(int[] array) {

        return array.length;
    }

    /**
     * @param array, eg: {3, 2, 1}
     * @return first value of the array, eg: 3
     */
    public int firstValue(int[] array) {

        return array[0];
    }

    /**
     * @param array, eg: {3, 2, 1}
     * @return last value of the array, eg: 1
     */
    public int lastValue(int[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array,    eg: {3, 2, 1}
     * @param position, eg: 1
     * @return value of the array at position, eg: 2
     */
    public int valueAtPosition(int[] array, int position) {

        return array[position];
    }

    /**
     * @param array,    eg: {3, 8, 5}
     * @param value,    eg: 4
     * @param position, eg: 1
     * @return the array with the value replaced at position, eg: {3, 4, 5}
     */
    public int[] replace(int[] array, int value, int position) {
        array[position] = value;
        return array;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return sum of values of the array, eg: 6
     */
    public int sum(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter += array[i];
        }
        return counter;
    }

    /**
     * @param array,  eg: {1, 2, 3}
     * @param search, eg: 2
     * @return if array contains searched value, eg: true
     */
    public boolean contains(int[] array, int search) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search){
                return true;
            }
             
        }
            return false;
    }

    /**
     * @param array, eg: {"sample", "value"}
     * @return array where all words are capitalized, eg: {"Sample", "Value"}
     */
    public String[] capitalize(String[] array) {
        String[] result = new String[array.length];
        
        for (int i = 0; i < array.length; i++) {
            String word = array[i];
            String first = String.valueOf(word.charAt(0));
            first = first.toUpperCase();
            result[i] = first + word.substring(1, word.length());
        }
        return result;
    }

    /**
     * @param first,  eg: {1, 2, 3}
     * @param second, eg: {3, 2, 1}
     * @return if values in first and second arrays, in the same position, are
     *         equals, eg: false
     */
    public boolean equals(int[] first, int[] second) {
        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                return true;
            }

        }
        return false;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return array with reversed values, eg: {3, 2, 1}
     */
    public int[] reverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - 1 - i];
        }        
        return result;
    }

    /**
     * @param first,  eg: {1, 2, 3}+= 1
     * @param second, eg: {4, 5}
     * @return concatenates first and second values in one array,
     * eg: {1, 2, 3, 4, 5}
     */
    public int[] concat(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int counter = 0;
        for (int i = 0; i < first.length; i++) {  
            result[i] = first[i];
            counter ++;
            //utiliser counter pour démarrer à la bonne position sur le 2    
        }
        for (int i = 0; i < second.length; i++) {
            result[counter] = second[i];
            counter ++;
        }
        return result;
    }
}