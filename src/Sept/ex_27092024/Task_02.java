package Sept.ex_27092024;

public class Task_02 {
    public static void main(String[] args) {
       int count =0;
        int i=2;

        do{
            if (i%2==0){
                System.out.println(i);
                count++;
            }
            i++;
        } while (count <5);
    }
}
