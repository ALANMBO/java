public class Potencia {

    public static void main(String[] args) {
        int base = 2;
        int exponente = 3;
        calcularPotencia(base, exponente);
    }

    public static void calcularPotencia(int base, int exponente) {
        int resultado = 1;
        
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        System.out.println("La potencia de " + base + " elevado a " + exponente + " es: " + resultado);
    }
}

