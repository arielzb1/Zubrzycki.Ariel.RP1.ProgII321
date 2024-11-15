package Zubrzycki.Ariel;
import java.util.ArrayList;

public class JardinBotanico {
    private ArrayList<Planta> plantas;
    
    public JardinBotanico(){
        plantas = new ArrayList<>();
    }
    
    public void agregarPlanta(Planta planta) throws PlantaRepetidaException{
        if(planta == null){
            throw new NullPointerException("Me pasaste un null");
        }
        if(plantas.contains(planta)){
            throw new PlantaRepetidaException();
        }
        plantas.add(planta);      
    }
    
    public void mostrarPlantas(){
        if(!plantas.isEmpty()){
            for (Planta planta : plantas) {
                System.out.println(planta.toString() + "\n");;
            }
        }
    }
    
    public void podarPlantas(){
        if(!plantas.isEmpty()){
            for (Planta planta : plantas) { 
                if(planta instanceof Podable){
                    ((Podable)planta).podar();
                }else{
                    System.out.println("La flor "+ planta.getNombre()+" no se puede podar");
                }
                
            }
        }
    }    
}
