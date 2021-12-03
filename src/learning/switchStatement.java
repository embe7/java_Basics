package learning;

public class switchStatement {

    /*
        - kadang kita hanya butuh kondisi sederhana di if statement, seperti hanya menggunakan perbandingan ==
        - Switch adalah statement percabangan yang sama dengan if, namun lebih sederhana cara pembuatannya
        - kondisi di switch statement hanya untuk perbandingan ==
     */

    public static void main(String[] args) {

        var nilai = "D";

        switch (nilai) {
            case "A":
                System.out.println("Anda Lulus dengan Nilai Memuaskan");
                break;
            case "B":
            case "C":
                System.out.println("Anda Lulus");
                break;
            case "D":
                System.out.println("Remedial/Ujian Perbaikan");
                break;
            case "E":
                System.out.println("Tidak Lulus");
                break;
            default:
                System.out.println("Anda Salah jurusan");
        }

        /* Switch Lambda
            - di java versi 14, diperkenalkan switch expression dengan lambda
            - ini lebih mudah saat penggunaan switch expression karena tidak perlu lagi menggunakan kata kunci break
         */

        var nilai2 = "B";

        switch (nilai2) {
            case "A" -> System.out.println("Sangat Baik");
            case "B", "C" -> System.out.println("cukup baik");
            case "D" -> System.out.println("Buruk");
            default -> System.out.println("Sangat Buruk");
        }

        /* Kata kunci yield
            - di java 14, ada kata kunci baru yaitu yield, dimana kita menggunakan kata kunci yield untuk mengembalikan nilai pada switch statement
            - ini sangat mempermudah kita ketika membuat data berdasarkan kondisi switch statement
         */

        var nilai3 = "D";
        String ucapan;

        switch (nilai3) {
            case "A" -> ucapan = "Sangat baik";
            case "B", "C" -> ucapan = "Cukup baik";
            case "D" -> ucapan = "Buruk";
            default -> ucapan = "Sangat buruk";
        }
        System.out.println(ucapan);

        //contoh lain penggunaan yield switch

        var nilai4 = "A";
        ucapan = switch (nilai4) {
            case "A":
                yield "Sangat Baik";
            case "B", "C":
                yield "Cukup Baik";
            case "D":
                yield "Buruk";
            default:
                yield "Sangat Buruk";
        };
        System.out.println(ucapan);


    }
}
