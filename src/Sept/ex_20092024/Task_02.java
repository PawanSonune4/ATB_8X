package Sept.ex_20092024;

public class Task_02 {
    public static void main(String[] args) {
        int score = 85;

        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "F";

        System.out.println("The grade is: " + grade);


    }
}
