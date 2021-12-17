package learning;

public class RecursiveMethod {

    /*
        - Recursive method adalah kemampuan method memanggil method dirinya sendiri
        - kadang memang banyak problem, yang lebih mudah diselesaikan dengan recursive method, seperti contoh nya kasus faktorial

        Problem Dengan Recursive
        -walaupun recursive method itu sangat menarik, namun kita perlu berhati-hati
        -jika recursive terlalu dalam, maka ada kemungkinan terjadi error StackOverflow, yaitu error dimana stack method terlalu banyak di java
        - kenapa problem ini bisa terjadi? karena ketika memanggil method, java akan menyimpannya dalam stack, jika method tersebut memanggil method lain,
          maka stack akan menumpuk terus, dan jika terlalu dalam, maka stack akan terlalu besar, dan bisa menyebabkan error StackOverflow
     */

    public static void main(String[] args) {

        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));

    }
    //Factorial Loop

    static int factorialLoop(int value){
        int result = 1;

        for (int i = 1; i<= value; i++){
            result *= i;
        }
        return result;

    }

    //Factorial Recursive

    static int factorialRecursive(int value){
        if (value == 1){
            return 1;
        }else {
            return value * factorialRecursive(value -1);
        }
    }
}
