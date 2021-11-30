package learning;

public class OperasiMatematika {

    public static void main(String[] args) {

        int bilA = 100;
        float bilB = 10.5f;

        System.out.println(bilA + bilB);
        System.out.println(bilA - bilB);
        System.out.println(bilA / bilB);
        System.out.println(bilA * bilB);
        System.out.println(bilA % bilB);

        //Augmented Assigment
        int bilC = 50;
        bilC += 10;
        System.out.println(bilC);

        bilC -= 10;
        System.out.println(bilC);

        bilC *= 10;
        System.out.println(bilC);

        bilC /= 10;
        System.out.println(bilC);

        bilC %= 9;
        System.out.println(bilC);
    }
}
