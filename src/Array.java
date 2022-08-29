import java.util.Random;

public class Array {
    public static void main(String[] args) {

        int[][] array = new int[5][5];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt();
            }
        }
        int avg =0;
        int max = array[0][0];
        int min = array[0][0];
        int i, g = 0;
        for ( i = 0; i < array.length; i++) {
            for ( g = 0; g < array[i].length; g++) {
                if (max < array[i][g]){   // находим максимальное число
                    max=array[i][g];
                }
                if (min > array[i][g]){   // находим минимальное число
                    min =array[i][g];
                }
                avg += array[i][g];
            }
        }
        avg  /=  i*g ; // находим среднее число

        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + avg);


    }
}

