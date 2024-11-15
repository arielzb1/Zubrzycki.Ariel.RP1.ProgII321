package Zubrzycki.Ariel;

public class Flor extends Planta{
    private TipoTemporada temporada;
    
    public Flor(String nombre, String ubicacion, String clima, TipoTemporada temporada) {
        super(nombre, ubicacion, clima);
        this.temporada = temporada;
    }

    public String toString() {
        return "tipo=Flor " + super.toString() + ", temporada=" + temporada;
    }

    
    
}
