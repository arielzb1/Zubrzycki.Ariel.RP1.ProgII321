package Zubrzycki.Ariel;

public class SistemaGestion {
    
    public static void main(String[] args) {
        JardinBotanico jardin = new JardinBotanico();
        
        cargarJardin(jardin);
        
        jardin.mostrarPlantas();
        
        jardin.podarPlantas();
    }
    
    public static void cargarJardin(JardinBotanico jardin){
        try{
            jardin.agregarPlanta(new Flor("Rosa", "Norte", "Soleado", TipoTemporada.PRIMAVERA));
            jardin.agregarPlanta(new Arbusto("Arraclan", "Norte", "Soleado", 10));
            jardin.agregarPlanta(new Arbol("Roble", "Sur", "Humedo", 8));
        }
        catch (Exception exception){
            System.out.println(exception);
        }
    }    
}
