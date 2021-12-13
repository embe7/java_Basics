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

        var a = 100;
        var b = 200;
        var c = sum(a,b);

        var Nama = "Suhemdri ";
        var NPM = 18110460;
        var Kelas = " TI-M1803";
        var DataDiri = data(Nama,NPM,Kelas);

        System.out.println(DataDiri);
        System.out.println(c);

        System.out.println(penjumlahan(100,"-",50));

    }

    static int sum(int bilA ,int bilB){
        var total = bilA + bilB;
        return total;
    }

    static String data(String Nama, int Npm, String Kelas){
        var DataLengkap = Nama + Npm + Kelas;
        return DataLengkap;
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
