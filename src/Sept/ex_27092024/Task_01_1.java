package Sept.ex_27092024;

public class Task_01_1 {
    public static void main(String[] args) {
        int number=1;
        int sum=0;

        while(number<=100){
            if (number%2!=0) {
                sum += number;
            }
            number++;
        }
        System.out.println(sum);
    }
}
