public class Nodo{
    private int data;
    private Nodo next;
    public Nodo(int d, Nodo n){
    data = d;
    next = n;
    }
    public int getData(){
    return data;
    }
    public Nodo getNext(){
    return next;
    }
    public void setNext(Nodo n){
    next = n;
    }
    }
