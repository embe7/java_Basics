package learning;

public class doWhileLoop {

    /*
        - Do while loop adalah perulangan yang mirip dengan while
        - perbedaannya hanya pada pengecekan kondisi
        - pengecekan kondisi di while loop dilakukan awal sebelum perulangan dilakukan,
          sedangkan di do while loop perulangan dilakukan setelah perulangan dilakukan
        - oleh karena itu didalam do while loop, minimal pasti sekali perulangan dilakukan walaupun kondisi tidak bernilai terue
     */

    public static void main(String[] args) {

        int angka = 100;

        do {
            System.out.println("Perulangan ke-"+ angka);
            angka++;
        }while (angka < 10);
    }
}
