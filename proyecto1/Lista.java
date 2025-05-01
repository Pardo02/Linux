package proyecto1;
public class Lista{
    Nodo head = null;

    public void agregarOrdenado(int data) {
        Nodo nuevo = new Nodo(data, null);
        
        if (head == null) {
            head = nuevo;
            return;
        }
        imprimirContenido();
        
        if (data < head.getData()) {
            nuevo.setNext(head);
            head = nuevo;
            return;
        }
        imprimirContenido();
        
        Nodo actual = head;
        while (actual.getNext() != null && data > actual.getNext().getData()) {
            actual = actual.getNext();
        }
        imprimirContenido();
        
        nuevo.setNext(actual.getNext());
        actual.setNext(nuevo);
        imprimirContenido();
    }
    public void agregarAlFinal(int data){
        Nodo nuevo = new Nodo(data, null);
        if( head == null )
            head = nuevo;
        else{
            Nodo aux = head;
            while( aux.getNext() != null)
                aux = aux.getNext();
            aux.setNext( nuevo );
        }
    }

    
    public void imprimirContenido(){
        Nodo aux = head;
        while( aux != null ){
            System.out.print( aux.getData() + "; " );
            aux = aux.getNext();
        }
        System.out.println();
    
    }
    public boolean estaContenido(int data){
        Nodo aux = head;
        while( aux != null ){
            if( data < aux.getData() )
        
            aux = aux.getNext();
        }
        return false;
    }
    public boolean eliminar(int data){
        if( head != null)
            if( head.getData() == data ){
                head = head.getNext();
            return true;
        }else{
            Nodo aux = head;
            while( aux.getNext() != null ){
                if( aux.getNext().getData() == data ){
                    aux.setNext( aux.getNext().getNext() );
                    return true;
                }
                aux = aux.getNext();
            }
        }
        return false;
    }
    }