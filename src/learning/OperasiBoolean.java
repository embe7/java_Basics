package learning;

import org.w3c.dom.ls.LSOutput;

public class OperasiBoolean {

    public static void main(String[] args) {

        int absen = 75;
        int nilai = 75;

        boolean lulusAbsen = absen >=75;
        boolean lulusNilai = nilai >= 75;

        boolean lulus = lulusAbsen && lulusNilai;

        System.out.println(lulus);

    }

}
