package learning;

public class breakDanContinue {
    /*
        - pada switch statement, kita sudah mengenal kata kunci break, yaitu untuk menghentikan case dalam switch
        - sama dengan pada perulangan, break juga menghentikan seluruh perulangan.
        - namun berbeda dengan continue, continue digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan perulangan selanjutnya
     */

    public static void main(String[] args) {

        //Kode Break

        var nilai = 1;

        while (true){
            System.out.println("perulangan ke-" + nilai);
            nilai++;

            if (nilai > 10) {
                break;
            }
        }
        System.out.println("Perulangan berhenti");

        //Penggunaan Continue

        for (int nilai2 = 1; nilai2 <= 100; nilai2++){
            if (nilai2 % 2 == 1){
                continue;
            }
            System.out.println("perulangan ke-" + nilai2);
        }
        System.out.println("perulangan berhenti");
    }
}
