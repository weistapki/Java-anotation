package annotation.benckmark;

public class FibExample {
    @Benckmark
    public static long iterativeFib(long n){
        if (n <= 1){
            return n;
        }
        int fib = 1;
        int prevFib = 1;
        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }
    @Benckmark
    public static int recursiveFib(int n){
        if (n <= 1){
            return n;
        }
        return recursiveFib(n-1) + recursiveFib(n-2);
    }
}
