package Zubrzycki.Ariel;

import java.util.Objects;

public abstract class Planta{
    private String nombre;
    private String ubicacion;
    private String clima;
    
    public Planta(String nombre, String ubicacion, String clima){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.clima = clima;
    }
    
    public void mostrar(){
        System.out.println(toString());
    }
  
    public String toString() {
        return "nombre=" + nombre + ", ubicacion=" + ubicacion + ", clima=" + clima;
    }    

    public int hashCode() {
        return Objects.hash(nombre, ubicacion);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Planta other = (Planta) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.ubicacion, other.ubicacion); 
    }       

    public String getNombre() {
        return nombre;
    }
}
