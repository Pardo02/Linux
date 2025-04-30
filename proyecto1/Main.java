public class Main {
    public static void main(String[] args) {
  
        Lista lista = new Lista();
        
        int[] datos = {14, 55, 22, 65, 78};
        for (int dato : datos){
            lista.agregarOrdenado(dato);
     
        }

        lista.imprimirContenido();


    }
}
