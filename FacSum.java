import java.util.Scanner;

public class FacSum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor entero positivo (n): ");
        int n = scanner.nextInt();

        long sum = 0; 

        for (int i = 1; i <= n; i++) {
            long factorial = calculateFactorial(i); 
            if (i % 2 == 0) {
                sum -= factorial; 
            } else {
                sum += factorial; 
            }
        }

        System.out.println("La suma de la serie es: " + sum);
    }

    public static long calculateFactorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}

