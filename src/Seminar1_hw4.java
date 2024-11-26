import java.util.Arrays;

public class Seminar1_hw4 {

    public static void main(String[] args) {
        int[] arr1 = {8, 15, 16};

        // Массивы имеют разную длину
        // int[] arr2 = {4, 5};

        // Деление на 0
        // int[] arr2 = {4, 5, 0};

        int[] arr2 = {4, 5, 2};

        try {
            int[] result = divArrays(arr1, arr2);
            System.out.println(Arrays.toString(result));
        } catch (RuntimeException e) {
            // Массивы имеют разную длину (получили сообщение в результате проброса)
            // Деление на 0 (получили сообщение в результате проброса)
            System.err.println(e.getMessage());
        }
    }

    public static int[] divArrays(int[] arr1, int[] arr2) throws RuntimeException {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Массивы имеют разную длину");
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Деление на 0");
            }
            else {
                result[i] = arr1[i] / arr2[i];
            }
        }
        return result;
    }
}
