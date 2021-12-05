package learning;

public class foeEach {
    /*
        - kadang kita bisa mengakses data array menggunakan perulangan
        - mengakses data array sangat bertele tele, kita harus membuat counter, lalu mengakses array menggunakan counter yang kita buat
        -  namun untungnya, di java terdapat perulangan for each, yang dapat mengakses seluruh data array dengan otomatis
     */

    public static void main(String[] args) {

        //Tanpa for each

        String[] data = {
                "Suhendri","18110460","TI-M1803"
        };

        for (int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }

        //Menggunakan for each

        String[] data2 = {
          "Suhendri","18110460","TI-M1803"
        };

        for (String printData : data2){
            System.out.println(printData);
        }
    }

}
