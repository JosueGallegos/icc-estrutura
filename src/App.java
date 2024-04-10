public class App {
    public static void main(String[] args) throws Exception {
        MetodoOrdenamiento metodoOrdenamiento = new MetodoOrdenamiento();

        int [] numeros ={30 , 7, 12, 5};


        metodoOrdenamiento.imprime(numeros);

        int [] arregloOrdenamientoBluble = metodoOrdenamiento.sortByBubble(numeros);
        MetodoOrdenamiento.imprime(arregloOrdenamientoBluble);

    
    }
}
 