package jearias.katas.algorithm.sort;

/**
 * <p>
 * DutchFlagOrder
 * </p>
 * <p>
 * http://en.wikipedia.org/wiki/Dutch_national_flag_problem
 * </p>
 * 
 * @author Mobbeel Solutions, SLL 29/10/2013
 */
public class DutchFlagOrder {

    /**
     * Original implementation of Dutch Flag Sort Algorithm
     * 
     * @param arr
     * @param p
     * @param k
     */
    public static void dutchFlagSort(int[] arr, int p, int k) {
        int p_index = 0;
        int k_index = arr.length - 1;
        for (int i = 0; i <= k_index;) {
            if (arr[i] < p) {
                swap(arr, i, p_index);
                p_index++;
                i++;
            } else if (arr[i] >= k) {
                swap(arr, i, k_index);
                k_index--;
            } else {
                i++;
            }
        }
    }

    /**
     * Custom implementation of the "Dutch Flag Sort" with a string of uppercase, lowercase and digits
     * 
     * @param chain
     * @return
     */
    public static String dutchFlagSortWithStrings(String chain) {
        int initIndex = 0;
        int endIndex = chain.length() - 1;
        char[] array = chain.toCharArray();
        for (int i = 0; i < endIndex;) {
            if (Character.isUpperCase(array[i])) {
                array = swap(array, initIndex, i);
                initIndex++;
                i++;
            } else if (Character.isLowerCase(array[i])) {
                array = swap(array, i, endIndex);
                endIndex--;
            } else {
                i++;
            }
        }
        return String.valueOf(array);
    }

    private static char[] swap(char[] array, int index1, int index2) {
        char aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
        return array;
    }

    private static int[] swap(int[] array, int index1, int index2) {
        int aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
        return array;
    }
}
