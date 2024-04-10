public class MetodoOrdenamiento {
    public int[] sortByBubble(int[]arreglo){


        int tamano = arreglo.length;


        for (int i= 0; i< tamano; i++){
            System.out.println("pasado numeros"+i);


            for (int j=i+1; j< tamano;j++){
                System.out.println("i="+arreglo[i]+ "j="+arreglo[i]);
                if (arreglo[i]> arreglo[j]){


                    int temporal = arreglo[i];
                    arreglo[i]= arreglo[j];
                    arreglo[j]= temporal;

                    System.out.print(" ");
                    imprime(arreglo);
                }
            }

        }

        return arreglo;


    }
    
    /// 2. metodo que devuelve un arreglo de enteros
    /// 3. metodo que devuelve un arreglo de enteros 
    /// 4. metodo que imprime un arreglo
    public void imprime(int[] arreglo){
        for (int i =0 ;i< arreglo.length; i++){
    
            System.out.println(arreglo[i] + " ");
    
        }
        System.out.println();
    
    
        
    }
}

