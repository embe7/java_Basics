package learning;

public class ifStatement {

    /*
        - di java, if adalah salah satu kata kunci yang digunakan untuk percabangan
        - percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi
        - hampir semua bahasa pemrograman menggunakan if expresion
     */

    public static void main(String[] args) {

        int nilai = 80;
        int absen = 100;

        if (nilai >= 100 && absen >= 100){
            System.out.println("Nilai Anda A");
        }else if (nilai >= 80 && absen >= 80){
            System.out.println("Nilai Anda B");
        }else if (nilai >= 65 && absen >= 65){
            System.out.println("Nilai Anda C");
        }else {
            System.out.println("Anda Tidak Lulus");
        }
    }
}
