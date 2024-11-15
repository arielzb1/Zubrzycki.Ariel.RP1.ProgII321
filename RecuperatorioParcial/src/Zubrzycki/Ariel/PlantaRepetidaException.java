package Zubrzycki.Ariel;

public class PlantaRepetidaException extends RuntimeException{
    private static final String MESSAGE = "La planta ya esta en la lista";
    
    public PlantaRepetidaException(){
        super(MESSAGE);
    }
}
