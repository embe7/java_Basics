package learning;

public class foeEach {
    /*
        - kadang kita bisa mengakses data array menggunakan perulangan
        - mengakses data array sangat bertele tele, kita harus membuat counter, lalu mengakses array menggunakan counter yang kita buat
        -  namun untungnya, di java terdapat perulangan for each, yang dapat mengakses seluruh data array dengan otomatis
     */

    public static void main(String[] args) {

        //Tanpa for each

        String[] data = {"Suhendri","18110460","TI-M1803"};

        for (int i = 0; i < data.length;i++){
            System.out.println(data[i]);
        }

        //Menggunakan For Each

        String[] data2 = {"Hendri","18110440","TI-M1803"};

        for (String PrintData : data2){
            System.out.println(PrintData);
        }

        //contoh for each studi kasus multi dimensi array

        String[][] data3 = {
                {"Suhendri","18110460","TI-M1803"},
                {"Fahri Abizar","18110450","TI-M1803"},
                {"Irvan","18110355","TI-M1803"}
        };

        for (String[] PrintDataMD : data3){
            for (int i = 0; i < PrintDataMD.length; i++){
                System.out.println(PrintDataMD[i]);
            }
        }
    }

}
