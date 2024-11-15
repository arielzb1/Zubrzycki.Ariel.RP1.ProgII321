package Zubrzycki.Ariel;

public class Arbol extends Planta implements Podable{
    private int alturaMaxima;
    
    public Arbol(String nombre, String ubicacion, String clima, int alturaMaxima) {
        super(nombre, ubicacion, clima);      
        this.alturaMaxima = alturaMaxima; 
    }

    public String toString() {
        return "tipo=Arbol " + super.toString() + ", altura maxima=" + alturaMaxima;
    }
    
    public void podar() {
        System.out.println("El arbol " + getNombre() + " se ha podado");
    }  
}
