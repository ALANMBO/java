public class Sumadenumerospares {

    public static void main(String[] args) {
        int n = 10; 
        int suma = suma(n);
        System.out.println("La suma de los números pares hasta " + n + " es: " + suma);
    }
  
    public static int suma(int n) {
        int suma = 0;
        for (int i = 2; i <= n; i += 2) { 
            suma += i;
        }
        return suma;
    }   
}

