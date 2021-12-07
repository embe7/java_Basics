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

        user("Suhendri","belajar Java");
        user("Fahri Abizar","belajar Matematika");
        user("Irvan Maulana","belajar Animasi");
    }

    static void user(String nama , String tujuan ){

        System.out.println("hallo saya " + nama + " saya sedang " + tujuan);
    }
}
