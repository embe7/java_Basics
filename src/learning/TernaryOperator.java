package learning;

public class TernaryOperator {

    /*
        - Ternary operator adalah operator sedehana dari if statement
        - Ternary operator terdiri dari kondisi yang dievaluasi, jika menghasilkan true maka nilai pertama diambil,
          jika false maka nilai kedua yang diambil
     */

    public static void main(String[] args) {

        int Nilai = 75;
        String Ucapan = Nilai >= 75? "Lulus" : "Tidak Lulus";

        System.out.println(Ucapan);
    }
}
