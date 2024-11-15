package Zubrzycki.Ariel;

public class Arbusto extends Planta implements Podable{
    private static final int MAX_DENSIDAD = 10;
    private static final int MIN_DENSIDAD = 1;
    private int densidad;
    
    public Arbusto(String nombre, String ubicacion, String clima, int densidad) {
        super(nombre, ubicacion, clima);
        this.densidad = densidad;
    }
   
    public int getDensidad() {
        if(densidad < MIN_DENSIDAD || densidad > MAX_DENSIDAD){
            throw new IllegalArgumentException("La densidad no se encuentra entre " + MIN_DENSIDAD + " y " + MAX_DENSIDAD);
        }
        return densidad;
    }
    
    public String toString() {
        return "tipo=Arbusto " + super.toString() + ", densidad=" + getDensidad();
    }

    public void podar() {
        System.out.println("El arbusto " + getNombre() + " se ha podado");
    }   
}
