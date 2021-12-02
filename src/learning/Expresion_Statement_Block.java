package learning;

import java.util.Date;

public class Expresion_Statement_Block {

    /*
        - Expresion adalah kontruksi dari variabel, operator dan pemanggilan method yang mengevaluasi menjadi
          sebuah single value.
        - Expresion adalah core component dari statement
     */

    public static void main(String[] args) {

        int value; //expresion
        value = 10; //expresion

        System.out.println(value = 100); //statement

     /*
        - Statement bisa dibilang adalah kalimat legkap dalam bahasa
        - Sebuah Statement berisikan exection complit, biasanya diahiri dengan titik koma
        - ada beberapa jenis statement :
            - Assigment expresion
            - penggunaan ++ dan --
            - method inovaction
            - object creation expresion
      */

        double aValue = 8990.67; //assigment ststement
        aValue++; //increment ststement
        System.out.println("Hello World"); //method inovaction statement
        Date date = new Date(); //object create statement

        /*
            - Block adalah kumpulan statement yang terdiri dari nol atau lebih statement
            - Blok diawali dan diakhiri dengan kurung kurawal {}

         */

    }
}
