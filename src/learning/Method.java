package learning;

public class Method {

    /*
        - Method adalah bok kode program yang akan berjalan saat kita panggil
        - sebelumnya kita pernah menggunakan method println() untuk menampilkan tulisan di console
        - UNtuk membuat method di java, kita bisa menggunakan kata kunci void, lalu diikuti dengan
          nama method, kurung() dan diakhiri dengan blok
        - kita bisa memanggil method dengan menggunakan nama method lalu diikuti dengan kurung.
        - di bahasa pemrograman lain, method juga disebut dengan function
     */

    public static void main(String[] args) {

        sayHello();

    }

    static void sayHello(){
        System.out.println("Hello World");
    }
}
