public class Factorial{

    public static void main(String[] args) {
        int a = 1;
        int b = 6;
        System.out.println("El factorial de " + b + " es: " + fac(a, b));
    }
  
    public static int fac(int a1, int b) {
        int factorial = 1;
        for (var i = 2; i <= b; i++) {
            factorial *= i;
        }
        return factorial;
    }   
}

