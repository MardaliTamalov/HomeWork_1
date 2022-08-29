import org.testng.annotations.Test;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {5, 6, 3, 2, 5, 1, 4, 9};

        for (int i = 0; i < array.length - 1; i++) {
            for (int a = 0; a < array.length - i - 1; a++) {

                if (array[a] > array[a + 1]) {
                    int temp = array[a];
                    array[a] = array[a + 1];
                    array[a + 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

       @Test
        public void arraySortTest( int[] array){
           int[] array2 = {1, 2, 3, 4, 5, 5, 6, 9};
           assert Arrays.equals(array,array2);
        }

}
