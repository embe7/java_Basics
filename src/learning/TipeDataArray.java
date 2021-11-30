package learning;

public class TipeDataArray {

    /* - Array adalah tipe data yang berisi kumpulan data dengan tipe yang sama.
       - Jumlah data di array tidak bisa berubah setelah pertama kali dibuat
    */

    public static void main(String[] args) {

        String [] arrayString ;
        arrayString = new String[3];
        arrayString [0] = "Suhendri";
        arrayString [1] = "18110460";
        arrayString [2] = "Teknik Informatika";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);
        System.out.println(arrayString.length);

        //cara lain pembuatan array
        int[] arrayinteger = new int[]{
          10,20,30,40,50
        };

        System.out.println(arrayinteger[0]);
        System.out.println(arrayinteger[1]);
        System.out.println(arrayinteger[2]);
        System.out.println(arrayinteger[3]);
        System.out.println(arrayinteger[4]);
        //melihat panjang nilai array
        System.out.println(arrayinteger.length);

        //cara lain pembuatan array
        long[] arrayLong = {
          60,70,80,90,100
        };

        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong[2]);
        System.out.println(arrayLong[3]);
        System.out.println(arrayLong[4]);
        System.out.println(arrayLong.length);


        //Array Multi Dimensi (array di dalam array)

        String [][] mahasiswa = {
                {"Suhendri","18110460","TI-M1803"},
                {"Fahri Abizar","18110355","TI-M1804"},
                {"Alwi","18110344","TI-M1803"}
        };

        System.out.println(mahasiswa[0][0]);
        System.out.println(mahasiswa[1][0]);
        System.out.println(mahasiswa[2][0]);

    }

}
