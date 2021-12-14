package learning;

public class MethodReturnValue {

    /*
        - secara default, method itu tidak menghasilkan value apapun, namun jika kita ingin, kita bisa membuat method
          mengembalikan nilai.
        - agar method bisa menghasilkan value, kita harus mengubah kata kunci void dengan tipe data yang dihasilkan
        - dan didalam blok method, untuk menghasilkan nilai tersebut, kita harus menggunakan kata kunci return, lalu
          diikuti dengan data yang sesuai dengan tipe data yang sudah kita deklarasikan di method
        - di java, kita hanya bisa menghasilkan 1 data di sebuah method, tidak bisa lebih dari satu
     */

    public static void main(String[] args) {

        System.out.println(data("suhendri ",18110460," TI-M1803"));

        System.out.println(penjumlahan(100,"+",100));
    }

    static String data(String Nama, int Npm, String Kelas){
        var DataDiri = Nama + Npm + Kelas;
        return DataDiri;
    }

    static int penjumlahan(int bilA, String operasi, int bilB){
        switch (operasi){
            case "+":
                return bilA + bilB;
            case "-":
                return bilA - bilB;
            default:
                return 0;
        }
    }
}
