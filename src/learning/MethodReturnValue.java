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

        String name = "Suhendri ";
        String npm = "18110460 ";
        String kelas = "TI-M1803";

        String dataDiri = DataDiri(name,npm,kelas);

        System.out.println(dataDiri);

        System.out.println(DataDiri("Gopi Putra ","18110445 " ,"TI-M1804 "));

        System.out.println(hitung(100,"+",100));
        System.out.println(hitung(200,"-",100));
    }

    static String DataDiri(String value1, String value2, String value3){
        String dataLengkap = value1 + value2 + value3;
        return dataLengkap;
    }

    static int hitung(int value1, String operasi, int value2){
        switch (operasi){
            case "+" :
                return value1 + value2;
            case "-" :
                return value1 - value2;
            default:
                return 0;
        }
    }
}
