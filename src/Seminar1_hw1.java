public class Seminar1_hw1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        System.out.println(sum_test1(arr));
        System.out.println(div_test2(10, 0));
        System.out.println(con_test3("s"));

    }

    //    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    //    at Seminar1_hw1.sum_test1(Seminar1_hw1.java:15)
    //    at Seminar1_hw1.main(Seminar1_hw1.java:5)
    public static int sum_test1(int[] arr){

        int sum = 0;
        for (int i = 1; i <= arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    //    Exception in thread "main" java.lang.ArithmeticException: / by zero
    //    at Seminar1_hw1.div_test2(Seminar1_hw1.java:27)
    //    at Seminar1_hw1.main(Seminar1_hw1.java:6)
    public static int div_test2(int a, int b){
        return a / b;
    }

    //    Exception in thread "main" java.lang.NumberFormatException: For input string: "s"
    //    at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
    //    at java.base/java.lang.Integer.parseInt(Integer.java:588)
    //    at java.base/java.lang.Integer.parseInt(Integer.java:685)
    //    at Seminar1_hw1.con_test3(Seminar1_hw1.java:25)
    //    at Seminar1_hw1.main(Seminar1_hw1.java:7)
    public static int con_test3(String simbS){
        return Integer.parseInt(simbS);
    }
}
