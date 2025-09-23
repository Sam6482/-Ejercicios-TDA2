public class cadena {
    static void InvertirCadena(String Texto){
        if(Texto == null || Texto.isEmpty() ){
            return ;
        }

       InvertirCadena( Texto.substring(1));
       System.out.println(Texto.charAt(0));
    }

    public static void main(String[] args) {
        String Cadena = "Hola";

        System.out.println("Cadena sin invertir es : " + Cadena );

        System.out.println("Cadena invertida es :");

        InvertirCadena(Cadena);
    }
}
