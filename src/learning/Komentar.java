package learning;

public class Komentar {

    /*
        - kadang dalam membuat program, kita sering menempatkan komentar di kode program tersebut
        - komentar adalah kode program yang akan dihiraukan saat proses kompilasi, sehingga di binary code java
          tidak akan ada kode komentar tersebut
        - biasanya komentar digunakan untuk dokumentasi
     */

    public static void main(String[] args) {

        System.out.println(sum(100,100));

    }

    /**
     * method untuk menjumlahkan value1 + value2
     *
     * @param value1 nilai value1
     * @param value2 nilai value2
     * @return value1 + value2
     */

    static int sum(int value1, int value2){
        //jumlahkan value1 ditambah value2
        return value1 + value2;
    }
}
