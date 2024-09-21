package Sept.ex_18092024;

public class Task_03 {
    public static void main(String[] args) {

        int a=10;

        System.out.println(--a + a++ + a--);
        System.out.println(a);

              //  a    |   Exp
              //  9    |   NA
              //  9    |   10
              //  10   |    9
             // ------------------
        //result= 28   |    9
    }
}
