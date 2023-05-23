
/**
 * Aggiungi qui una descrizione della classe ClienteGiaEsistente
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class ClienteGiaEsistente extends Exception{
    public ClienteGiaEsistente(){
        
    }
    
    public String toString(){
        return ("Cliente già presente nella mappa");
    }
}
