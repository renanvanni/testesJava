public class Fibonacci {
    // O programa imprime os 30 primeiros termos somente
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\n");
        }
    }

    static long fibo(int i) {
        return (i < 2) ? i : fibo(i - 1) + fibo(i - 2);
    }
}
