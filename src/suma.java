public class suma {
    
    public static int Recursivo(int n){
              if (n <= 0) {
                return 0;
              }
              
              else{
                return n + Recursivo(n-1);
              }
    }

    public static void main(String[] args) {
        int numero = 5;
        int resultado = Recursivo(numero);

        System.out.println("La suma de los primeros " + numero + "numeros es "+ resultado);
    }
}
