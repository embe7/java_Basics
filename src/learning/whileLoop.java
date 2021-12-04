package learning;

public class whileLoop {

    /*
        - While loop adalah versi perulangan yang lebih sederhana dibandingkan for loop
        - di while loop, hanya terdapat kondisi perulangan tanpa ada init statement dan post statement
     */

    public static void main(String[] args) {

        var counter = 1;

        while (counter <= 10){
            System.out.println("Perulangan Ke-" + counter);

            counter++;
        }
    }
}
