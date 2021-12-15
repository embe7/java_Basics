package learning;

public class whileLoop {

    /*
        - While loop adalah versi perulangan yang lebih sederhana dibandingkan for loop
        - di while loop, hanya terdapat kondisi perulangan tanpa ada init statement dan post statement
     */

    public static void main(String[] args) {

        int angka = 1;

        while (angka <=10){
            System.out.println("Ini perulangan ke-" + angka);
            angka++;
        }
        
    }
}
