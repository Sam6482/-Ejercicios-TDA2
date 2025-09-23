public class contar {
    
    public static int contar(String texto, char objetivo){
            if (texto == null|| texto.isEmpty()) {
                
                return 0;
            }
            
            String Palabra = texto.substring(1);

            if (texto.charAt(0) == objetivo ) {
                
                return 1 + contar(Palabra, objetivo);

            } else{

                return contar(Palabra, objetivo);
            } 

    }

    public static void main(String[] args) {
        
        String texto1 = "Programacion";
        char objetivo1 = 'o';


        int resultado1 = contar(texto1, objetivo1);
        System.out.println("La Palabra  " + objetivo1  +  "  Se conto en la palabra "  +  texto1 + " " + resultado1  +  "  veces");

        String texto2 = "aaaaaa";
        char objetivo2 = 'a';


        int resultado2 = contar(texto2, objetivo2);
        System.out.println("La Palabra  " + objetivo2  +  "  Se conto en la palabra "  +  texto2 + " " + resultado2  +  "  veces");

        String texto3 = "";
        char objetivo3 = 'x';


        int resultado3 = contar(texto3, objetivo3);
        System.out.println("La Palabra  " + objetivo3  +  "  Se conto en la palabra "  +  texto3 + " " + resultado3  +  "  veces");
    }
}
