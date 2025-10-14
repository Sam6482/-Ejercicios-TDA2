import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Hola");
        
         // int[][] arrBiB = new int[2][];

        //arrBiB[0] = new int[] {1,2,3,4};
        // arrBiB[1] = new int[] {5,6,7,8};

        //System.out.println(arrBiB[0][1]);


        //int[] arr = {1,2};
        
        //Copia superficial
        //int[] arrb = new int[2];
        
       // for(int i = 0 ; i < arr.length; i++){
            //arrb[i] = arr[i];
        //}
        
        //System.arraycopy(arr, 0, arrb, 0, 2);
       // arrb = Arrays.copyOf(arr, 5); //Pone 0 en los demas 
         //System.out.println(Arrays.toString(arrb));

      int[][] arrOriginal ={

           {1},   // impar -> agrega 0
          {6,3,1},       // impar -> agrega 0
          {1,2,3,4},     // par   -> agrega (1+4)=5
          {0,5,3,0},     // par   -> agrega (0+0)=0
          {2,5,9},       // impar -> agrega 0
          {2,4,8,9,10}   // impar -> agrega 0
        };
        
       
        int[][]  arraycopia = new int [arrOriginal.length][];

       System.out.println("Arreglo Original");
         
       for(int i = 0 ; i < arrOriginal.length; i++){
             
         for(int j = 0 ; j < arrOriginal[i].length; j++){
             
          System.out.print(arrOriginal[i][j] + " ");


       }
            System.out.println();
       }
       

       for (int i = 0; i < arrOriginal.length; i++) {
            int[] filaOriginal = arrOriginal[i];
            int longitudOriginal = filaOriginal.length;

           
            int[] nuevaFila = new int[longitudOriginal + 1];

            
            for (int j = 0; j < longitudOriginal; j++) {
                nuevaFila[j] = filaOriginal[j];
            }

         
            if (longitudOriginal % 2 == 0) { 
                int suma = filaOriginal[0] + filaOriginal[longitudOriginal - 1];
                nuevaFila[longitudOriginal] = suma;
            } else { 
                nuevaFila[longitudOriginal] = 0;
            }

          
            arraycopia[i] = nuevaFila;
        }


        System.out.println("\nArreglo Nuevo :");
        for (int[] fila : arraycopia) {
            
            System.out.println(Arrays.toString(fila));
        }
    }

       
    }

