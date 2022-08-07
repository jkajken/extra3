import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {2, 555, 4, 3, 20, 7, 6, 9};
        int i = 0;
        while (i < array.length) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
            i++;
        }
        System.out.println(Arrays.toString(array));
    }

}