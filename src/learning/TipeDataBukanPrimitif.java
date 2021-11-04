package learning;

public class TipeDataBukanPrimitif {

    public static void main(String[] args) {

        Integer iniInteger = 100;
        Byte iniByte = null;
        Long iniLong = 1000L;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        //konversi tipe data primitif ke tipe data bukan primitif

        int intPrimitif = 1000;
        Integer intBukanPrimitif = intPrimitif;

        System.out.println(intBukanPrimitif);

        //contoh 2 :

        Integer age = 23;

        System.out.println(age);

        short age2 = age.shortValue();

        System.out.println(age2);

    }
}
