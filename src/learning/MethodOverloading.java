package learning;

public class MethodOverloading {

    /*
        - Method overloading adalah kemampuan membuat method denga nama yang sama lebih dari sekali
        - namun ada ketentuannya, yaitu data parameter di method tersebut harus berbeda-beda, ntah jumlah atau tipe parameter nya
        - jika ada yang sama maka program akan error
     */

    public static void main(String[] args) {

        sayHello();

        sayHello("Suhendri");

        sayHello("Suhendri",18110460);

    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String name){
        System.out.println("Hello " + name);
    }

    static void sayHello(String name,int NPM){
        System.out.println("Hello " + name + " " + NPM);
    }
}
