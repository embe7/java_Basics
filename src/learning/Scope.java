package learning;

public class Scope {

    /*
        - Di java, variabel hanya bisa di akses didalam area dimana mereka di buat.
        - hal ini disebut scope
        - contoh jika variabel dibuat di method, maka hanya bisa di akses di method tersebut,
          atau jika dibuat di dalam blok maka hanya bisa di akses di dalam blok tersebut
     */

    public static void main(String[] args) {

        sayHello("Suhendri");
        sayHello("");

    }

    static void sayHello(String name){
        String hello = "hallo " + name;

        if (!name.isBlank()){
            String hi = "hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello);
    }
}
