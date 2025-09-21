public class potencia {
    
    public static int Recursivo(int a, int b){
        if(b == 0){
           return 1;
        }

        else {
               return a * Recursivo(a, b - 1);
        }
    }

      public static void main(String[] args) {
        int base = 2;
        int exponente = 5;
        int resultado = Recursivo(base, exponente);
       
        System.out.println(base + " elevado a " + exponente + " es: " + resultado);

    }
}
