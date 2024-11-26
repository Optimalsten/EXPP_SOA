public class Seminar1_hw2 {

    public static void main(String[] args) {

        //        1. Exception in thread "main" java.lang.NumberFormatException: For input string: "s"
        //        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        //        at java.base/java.lang.Integer.parseInt(Integer.java:588)
        //        at java.base/java.lang.Integer.parseInt(Integer.java:685)
        //        at Seminar1_hw2.sum2d(Seminar1_hw2.java:15)
        //        at Seminar1_hw2.main(Seminar1_hw2.java:5)
        //  String[][] arr = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};

        //  3. Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "arr" is null
        //	at Seminar1_hw2.sum2d(Seminar1_hw2.java:22)
        //	at Seminar1_hw2.main(Seminar1_hw2.java:15)
        String[][] arr = null;
        System.out.println(sum2d(arr));
    }

    public static int sum2d(String[][] arr){

        int sum = 0;

        for (int i = 0; i < arr.length; i++){

            //  2. Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            //	at Seminar1_hw2.sum2d(Seminar1_hw2.java:22)
            //	at Seminar1_hw2.main(Seminar1_hw2.java:12)
            for (int j = 0; j < 4; j++){
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
