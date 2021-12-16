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

        dataDiri("Suhendri ",18110460, " TI-M1803");

        System.out.println(operasi(100,"*",10));

    }

    static String dataDiri(String Nama, int Npm, String Kelas){
        String data = Nama + Npm + Kelas;
        System.out.println(data);
        return data;
    }

    static int operasi(int BilA , String Operasi, int BilB){
        switch (Operasi){
            case "+" :
                return BilA + BilB;
            case "-":
                return BilA - BilB;
            case "*":
                return  BilA * BilB;
            case "/":
                return BilA / BilB;
            case "%":
                return BilA % BilB;
            default:
                return 0;
        }
    }
}
