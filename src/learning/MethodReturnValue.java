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

        var result1 = sum(100,100);
        System.out.println(result1);

        System.out.println(sum(200,200));

        System.out.println(hitung(100,"+",100));
        System.out.println(hitung(200,"-",100));
    }

    static int sum(int value1, int value2){
     int total = value1 + value2;
     return total;
    }
    static int hitung(int value1, String operasi, int value2){
        switch (operasi){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
