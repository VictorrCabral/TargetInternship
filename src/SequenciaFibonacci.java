import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = scanner.nextInt();

        boolean pertence = belongsToFibonacci(num);
        if (pertence) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean belongsToFibonacci(int n) {
        int a = 0, b = 1;
        if (n == a || n == b) return true;
        int c = a + b;
        while (c <= n) {
            if (c == n) return true;
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }
}
