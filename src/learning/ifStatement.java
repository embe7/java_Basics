package learning;

public class ifStatement {

    /*
        - di java, if adalah salah satu kata kunci yang digunakan untuk percabangan
        - percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi
        - hampir semua bahasa pemrograman menggunakan if expresion
     */

    public static void main(String[] args) {

        int NilaiUjian = 80;
        int NilaiAbsen = 75;

        if (NilaiUjian >= 75 & NilaiAbsen >= 75){
            System.out.println("Lulus");
        }else if (NilaiUjian >=50 & NilaiAbsen >= 50){
            System.out.println("Remedial");
        }else{
            System.out.println("Tidak Lulus");
        }
    }
}
