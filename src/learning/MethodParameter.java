package learning;

public class MethodParameter {
    /*
        - Kita bisa mengirim informasi ke method yang ingin kita panggil
        - untuk melakukan hal tersebut, kita perlu menambahkan parameter atau argumen di method yang sudah kita buat
        - cara membuat parameter sama seperti membuat variabel
        - parameter ditempatkan di dalam kurung() dideklarasi method
        - parameter bisa lebih dari satu, jika lebih dari satu, harus dipisah menggunakan tanda koma
     */

    public static void main(String[] args) {

        data("Suhendri",18110460);
    }

    static void data(String nama, int NPM){
        System.out.println("Hay " + nama + " " + NPM);
    }
}
