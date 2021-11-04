package learning;

public class TipeDataBukanPrimitif {

    public static void main(String[] args) {

        //tipe data bukan primitif

        Byte iniByte = 100;
        Short iniShort = 1000;
        Integer iniInteger = 10000;
        Long iniLong = 100000L;

        //konversi tipe data primitif ke Tipe Data Bukan Primitif

        //byte
        byte primitifByte;
        primitifByte = iniByte.byteValue();
        System.out.println(primitifByte);

        primitifByte = iniShort.byteValue();
        System.out.println(primitifByte);

        primitifByte = iniInteger.byteValue();
        System.out.println(primitifByte);

        primitifByte = iniLong.byteValue();
        System.out.println(primitifByte);

        //short
        short primitifShort;
        primitifShort = iniShort.shortValue();
        System.out.println(primitifShort);

        primitifShort = iniByte.shortValue();
        System.out.println(primitifShort);

        primitifShort = iniInteger.shortValue();
        System.out.println(primitifShort);

        primitifShort = iniLong.shortValue();
        System.out.println(primitifShort);

        //integer
        int primitifInteger;
        primitifInteger = iniInteger.intValue();
        System.out.println(primitifInteger);

        primitifInteger = iniByte.intValue();
        System.out.println(primitifInteger);

        primitifInteger = iniShort.intValue();
        System.out.println(primitifInteger);

        primitifInteger = iniLong.intValue();
        System.out.println(primitifInteger);

        //long
        long primitifLong;
        primitifLong = iniLong.longValue();
        System.out.println(primitifLong);

        primitifLong = iniByte.longValue();
        System.out.println(primitifLong);

        primitifLong = iniShort.longValue();
        System.out.println(primitifLong);

        primitifLong = iniInteger.longValue();
        System.out.println(primitifLong);





    }
}
