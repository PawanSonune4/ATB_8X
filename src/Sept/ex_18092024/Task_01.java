package Sept.ex_18092024;

public class Task_01 {
    public static void main(String[] args) {

        int Principal= 400;
        byte interest=124;

        // widening
        int ammount=Principal+interest; // implicit - widening casting - valid
        System.out.println(ammount);
        int Ammt= Principal + (int) interest; // explicit - widening casting - valid
        System.out.println(Ammt);

        // narrowing
        int price= 650;
        float discount = 67.52f;

        // int total= price-discount; implicit - narrowing casting - invalid
           int total = price- (int) discount; // explicit - narrowing casting - invalid - loosing data
        System.out.println(total);


    }
}
