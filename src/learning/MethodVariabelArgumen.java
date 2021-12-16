package learning;

public class MethodVariabelArgumen {

    /*
        - Kadang kita butuh mengirim data ke method sejumlah data tidak pasti
        - Biasanya, agar bisa seperti ini, kita akan menggunakan array sebagai parameter di method tersebut
        - Namun di java, kita bisa menggunakan variabel argumen, untuk mengirim data dengan jumlah tak tentu, bisa nol atau lebih
        - Parameter dengan tipe variabel argumen, hanya bisa ditempatkan di posisi akhir parameter.

     */

    public static void main(String[] args){

        int[] values = {80,50,60,50,80};
        sayCongrats("Suhendri",values);

        sayCongrats2("Fahri Abizar",80,80,80,80,70);

    }
    // Tanpa Method Variabel Argumen

    static void sayCongrats(String Nama, int[] values){
        var total = 0;
        for (var value : values){
            total += value;
        }

        var FinalValue = total / values.length;

        if (FinalValue >= 75){
            System.out.println("Selamat " + Nama +" Anda lulus dengan nilai : " + FinalValue);
        }else {
            System.out.println("Maaf" + Nama + " , Anda Tidak Lulus");
        }

    }

    //Menggunakan Method Variabel Argumen

    static void sayCongrats2(String Nama, int...values){
        int total = 0;

        for (int value : values){
            total += value;
        }
        int FinalValues = total / values.length;

        if (FinalValues >= 75){
            System.out.println("selamat " + Nama + " Anda Lulus");
        }else {
            System.out.println("Mohon maaf " + Nama + " Anda Tidak Lulus");
        }

    }

}
