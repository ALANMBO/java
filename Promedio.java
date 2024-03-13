public class Promedio {

    public static void main(String[] args) {
        int a = 2; 
        int b = 2;
        int c = 2;
        int promedio = pro(a, b, c);
        System.out.println("EL PROMEDIO ES: " + promedio);
    }
  
    public static int pro(int a1, int b, int c) {     
        int promedio;     
        promedio = (a1 + b + c) / 3;       
        return promedio;     
    }   
}


