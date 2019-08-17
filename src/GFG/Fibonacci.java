package GFG;

public class Fibonacci {

    public static int fib(int n) {

        if (n <= 1) {
            return 1;
        } else {
            return (fib(n - 2) + fib(n - 1));

        }

    }
}

class calling{
    public static void main(String[] args){
        System.out.println(Fibonacci.fib(5));

    }
}
