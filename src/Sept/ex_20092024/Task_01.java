package Sept.ex_20092024;

public class Task_01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 45;

        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

            // (10 > 20) ? (10 >45 ? 10: 45) : (20 > 45 ? 20 : 45);
            //               false    45           false    45
            //   false       ( true )                ( false)
            //                                result= false  (45)


        System.out.println(max);  // 45

    }
}
