package salmans;

import java.util.ArrayList;

public class Node {
    
    private Object value;
    private Node next;
    private int ID;
    private String Nombre;
    private Coordenada coordenada;
    private ArrayList<Arista> aristas = new ArrayList();
    


    public Node(Object value) {
        this.value = value;
    }

    public Node(int ID, String Nombre, int X, int Y) {
        this.ID = ID;
        this.Nombre = Nombre;
        coordenada.setX(X);
        coordenada.setY(Y);
    }
    
    
    public Node(Object value, Node next, int ID, Coordenada coordenada) {
        this.value = value;
        this.next = next;
        this.ID = ID;
        this.coordenada = coordenada;
    }

    public Node(int ID, String Nombre, Coordenada coordenada, ArrayList<Arista> aristas) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.coordenada = coordenada;
        this.aristas = aristas;
    }

    public Node(int ID, String Nombre, Coordenada coordenada) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.coordenada = coordenada;
    }
    
    
    
    public Node() {
        value = null;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
    public Node(int x, int y){
        value = null;
        this.coordenada = new Coordenada(x,y);
    }

    public Object getValue() {
        return value;
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Coordenada coordenada) {
        this.coordenada = coordenada;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return ""+value;
    }
    public boolean hasNext(){
        if(next != null)
            return true;
        return false;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    

    public ArrayList<Arista> getAristas() {
        return aristas;
    }

    public void setAristas(ArrayList<Arista> aristas) {
        this.aristas = aristas;
    }
  
    
    
    
   

    
    
    
    
    
    
}
